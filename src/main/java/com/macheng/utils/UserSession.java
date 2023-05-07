package com.macheng.utils;

import com.macheng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :UserSession
 * @date ：2023/4/19 19:47
 * @description：TODO
 */
@Component
public class UserSession {
    @Autowired
    private static ThreadLocal<User> threadLocal = new ThreadLocal<User>();
    public static void setUserSession(User user){
        threadLocal.set(user);
    }
    public static User getUserSession(){
        return threadLocal.get();
    }
}
