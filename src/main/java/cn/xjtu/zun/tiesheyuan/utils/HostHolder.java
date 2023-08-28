package cn.xjtu.zun.tiesheyuan.utils;

import cn.xjtu.zun.tiesheyuan.pojo.User;
import org.springframework.stereotype.Component;

/**
 * 持有用户信息，以代替session对象，session对象本身线程隔离
 */
@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUsers(User user){
        this.users.set(user);
    }

    public User getUser(){
        return this.users.get();
    }

    public void clear(){
        this.users.remove();
    }
}
