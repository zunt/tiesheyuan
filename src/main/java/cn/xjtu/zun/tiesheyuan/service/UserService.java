package cn.xjtu.zun.tiesheyuan.service;

import cn.xjtu.zun.tiesheyuan.dao.UserMapper;
import cn.xjtu.zun.tiesheyuan.entity.User;
import cn.xjtu.zun.tiesheyuan.utils.BaseUtil;
import cn.xjtu.zun.tiesheyuan.utils.MailClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Value("${tiesheyuan.path.domain}")
    private String domain;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    public User fineUserById(int id){
        return userMapper.selectById(id);
    }

    public Map<String, Object> register(User user){
        Map<String, Object> map = new HashMap<>();
        if (user == null){
            throw new IllegalArgumentException("user为空");
        }
        if (StringUtils.isBlank(user.getTruename())){
            map.put("usernameMsg", "姓名不能为空");
            return map;
        }
        if (StringUtils.isBlank(user.getAccount())){
            map.put("useraccountMsg", "账号不能为空");
            return map;
        }
        if (StringUtils.isBlank(user.getAccount())){
            map.put("useraccountMsg", "账号不能为空");
            return map;
        }
        if (StringUtils.equals(user.getPassword(), user.getConfirmPassword())){
            map.put("passwordMsg", "两次输入的密码不相同");
            return map;
        }
        if (StringUtils.isBlank(user.getEmail())){
            map.put("mailMsg", "邮箱不能为空");
            return map;
        }

//        User u = userMapper.selectByEmail(user.getEmail());
//        if (u != null){
//            map.put("usernameMsg", "邮箱已被注册");
//            return map;
//        }
//        u = userMapper.selectByEmail(user.getEmail());
//        if (u != null){
//            map.put("mailMsg", "账号已存在");
//            return map;
//        }
//
//        user.setSalt(BaseUtil.generateUUID().substring(0, 5));
//        user.setPassword(BaseUtil.MD5(user.getPassword() + user.getSalt));
        user.setVerifyCode(BaseUtil.generateUUID());
        userMapper.insertUser(user);

        Context context = new Context();
        context.setVariable("email", user.getEmail());
//        https://localhost:8080/tiesheyuan/activation/{id}/{code}
        String url = domain + contextPath + "/activation/" + user.getUserid() + "/" + user.getVerifyCode();
        context.setVariable("url", user.getEmail());
        String content = templateEngine.process("/mail/activation", context);
        mailClient.sendMail(user.getEmail(), "激活您的账号", content);

//        https://images.nowcoder.com/head/1t.png




        return map;
    }
}
