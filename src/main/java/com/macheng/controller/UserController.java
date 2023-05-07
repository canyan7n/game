package com.macheng.controller;

import com.macheng.pojo.User;
import com.macheng.service.UserService;
import com.macheng.utils.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :LoginController
 * @date ：2023/4/16 11:16
 * @description：TODO
 */
@Controller
public class UserController {
    @Autowired
    private User user;
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/userregister")
    public String userRegister(User user){
        System.out.println(user);
        int row = userService.register(user);
        if(row > 0){
            return "index";
        }
        return "error";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpSession session, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user = userService.login(username,password);
        // session.setAttribute("user",user);
        model.addAttribute("user",user);
        if ( user != null){
            user.setIslogin(true);
            return "success";
//            userService.play();
        }
        return "error";
    }

    @RequestMapping("/toplay")
    public String play(Model model){
        if(!user.getIslogin()){
            return "fail";
        }
        UserSession.setUserSession(user);
        model.addAttribute("user",user);
        userService.play();
        return "play";
    }

    @RequestMapping("/logout")
    public String logout(){
        userService.logout(user.getUserId());
        user.setIslogin(false);
        return "logout";
    }
    
}
