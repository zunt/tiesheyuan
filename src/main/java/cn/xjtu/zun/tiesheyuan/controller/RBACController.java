package cn.xjtu.zun.tiesheyuan.controller;


import cn.xjtu.zun.tiesheyuan.pojo.User;
import cn.xjtu.zun.tiesheyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class RBACController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String getRegisterPage(){
        return "sites/register";
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String register(Model model, User user){
        Map<String, Object> map = userService.register(user);
        if(map == null || map.isEmpty()){
            model.addAttribute("msg", "注册成功，我们已经向您的邮箱发送了一封激活邮件，请尽快激活");
            model.addAttribute("target", "/index");
            user = null;
            return "sites/login";
        }else{
            for(String str : map.keySet()){
                System.out.println(map.get(str));
            }
            model.addAttribute("usernameMsg", map.get("usernameMsg"));
            model.addAttribute("accountMsg", map.get("accountMsg"));
            model.addAttribute("passwordMsg", map.get("passwordMsg"));
            model.addAttribute("mailMsg", map.get("mailMsg"));
            return "sites/register";
        }
    }
}
