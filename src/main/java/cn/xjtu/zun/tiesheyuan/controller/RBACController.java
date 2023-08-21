package cn.xjtu.zun.tiesheyuan.controller;


import cn.xjtu.zun.tiesheyuan.pojo.User;
import cn.xjtu.zun.tiesheyuan.service.UserService;
import com.google.code.kaptcha.Producer;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import static cn.xjtu.zun.tiesheyuan.utils.Constant.DEFAULT_EXPIREDTIMED;
import static cn.xjtu.zun.tiesheyuan.utils.Constant.REMEMBER_ME_ERPIREDTIMED;

@Controller
public class RBACController {

    private static final Logger logger = LoggerFactory.getLogger(RBACController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private Producer producer;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String getRegisterPage() {
        return "sites/register";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String getLogin() {
        return "sites/login";
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String register(Model model, User user) {
        Map<String, Object> map = userService.register(user);
        if (map == null || map.isEmpty()) {
            model.addAttribute("msg", "注册成功，我们已经向您的邮箱发送了一封激活邮件，请尽快激活");
            model.addAttribute("target", "/index");
            user = null;
            return "sites/login";
        } else {
            for (String str : map.keySet()) {
                System.out.println(map.get(str));
            }
            model.addAttribute("usernameMsg", map.get("usernameMsg"));
            model.addAttribute("accountMsg", map.get("accountMsg"));
            model.addAttribute("passwordMsg", map.get("passwordMsg"));
            model.addAttribute("mailMsg", map.get("mailMsg"));
            return "sites/register";
        }
    }

    @RequestMapping(path = "/cookie/set", method = RequestMethod.GET)
    @ResponseBody
    public String setCookie() {
        return "";
    }

    @RequestMapping(path = "/cookie/get", method = RequestMethod.GET)
    @ResponseBody
    public String getCookie(@CookieValue("keyname") String value) {
        return value;
    }

    @RequestMapping(path = "/session/set", method = RequestMethod.GET)
    @ResponseBody
    public String setSession(HttpSession session) {
        session.setAttribute("id", 1);
        return "";
    }

    @RequestMapping(path = "/session/get", method = RequestMethod.GET)
    @ResponseBody
    public String getSession(HttpSession session) {
        return (String) session.getAttribute("id");
    }

    @RequestMapping(path = "/login/kaptcha", method = RequestMethod.GET)
    public void getKaptcha(HttpServletResponse response, HttpSession session) {
        String text = producer.createText();
        BufferedImage image = producer.createImage(text);
        session.setAttribute("kaptcha", text);
        response.setContentType("image/png");
        try {
            OutputStream os = response.getOutputStream();
            ImageIO.write(image, "png", os);
        } catch (IOException e) {
            logger.error("响应验证码失败:" + e.getMessage());
        }
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(HttpServletResponse response, HttpSession session, String account, String password,
                        String code, boolean remember, Model model) {
//        验证码
        String kaptcha = (String) session.getAttribute("kaptcha");
        if (StringUtils.isBlank(kaptcha) || StringUtils.isBlank(code) || !kaptcha.equalsIgnoreCase(code)){
            model.addAttribute("codeMsg", "验证码不正确!");
            return "/sites/login";
        }

//        检查账号密码
        int expSeconds = remember ? REMEMBER_ME_ERPIREDTIMED : DEFAULT_EXPIREDTIMED;
        Map<String, Object> map = userService.login(account, password, expSeconds);
        if(map.containsKey("ticket")){
            Cookie cookie = new Cookie("ticket", map.get("ticket").toString());
            cookie.setPath(contextPath);
            cookie.setMaxAge(expSeconds);
            response.addCookie(cookie);
            return "redirect:/index";
        }else{
            model.addAttribute("accountMsg", map.get("accountMsg"));
            model.addAttribute("passwordMsg", map.get("passwordMsg"));
            return "sites/login";
        }
    }

    @RequestMapping(path = "/logout", method = RequestMethod.GET)
    public String logout(@CookieValue("ticket")String ticket){
        userService.logout(ticket);
        return "redirect:/login";
    }
}
