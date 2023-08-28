package cn.xjtu.zun.tiesheyuan.interceptor;

import cn.xjtu.zun.tiesheyuan.pojo.LoginTicket;
import cn.xjtu.zun.tiesheyuan.pojo.User;
import cn.xjtu.zun.tiesheyuan.service.UserService;
import cn.xjtu.zun.tiesheyuan.utils.CookieUtil;
import cn.xjtu.zun.tiesheyuan.utils.HostHolder;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Component
public class UserInterceptor implements HandlerInterceptor {

    @Autowired
    UserService userService;

    @Autowired
    HostHolder hostHolder;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        获得凭证
        String ticket = CookieUtil.getValue(request, "ticket");
        if (ticket != null) {
//            获得ticket对象并检查
            LoginTicket loginTicket = userService.findLoginTicket(ticket);
            if (loginTicket != null && loginTicket.getStatus() == 0 && loginTicket.getExpired().after(new Date())) {
//                获取ticket对应用户并存储
                User user = userService.fineUserById(loginTicket.getUserId());
                hostHolder.setUsers(user);
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        User user = hostHolder.getUser();
        if (user != null && modelAndView != null) {
            modelAndView.addObject("loginUser", user);
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        hostHolder.clear();
    }
}
