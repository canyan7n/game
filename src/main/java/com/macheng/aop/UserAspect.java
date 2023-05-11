package com.macheng.aop;

import com.macheng.pojo.User;
import com.macheng.utils.UserSession;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MyAspect
 * @date ：2023/3/30 12:01
 * @description：TODO
 */
@Component
@Aspect
public class UserAspect {

    @Pointcut("execution(* com.macheng.service.impl.UserServiceImpl.play())")
    public void pointOne(){}
    @Pointcut("execution(* com.macheng.service.impl.UserServiceImpl.logout(..))")
    public void pointTwo(){}

//    给玩家登录游戏加前置通知
    @Before("pointOne()")
    public void IsLogin(){
        User user = UserSession.getUserSession();
        if(user != null){
            System.out.println(user.getUsername() + "已登录");
        }else {
            System.out.println("未登录");
        }
    }

//    给玩家退出游戏加后置通知
    @After("pointTwo()")
    public void logOut(){
        System.out.println(UserSession.getUserSession());
        System.out.println("退出登录");
    }
}
