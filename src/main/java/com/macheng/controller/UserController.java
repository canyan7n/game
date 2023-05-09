package com.macheng.controller;

import com.macheng.pojo.Player;
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
import java.util.List;
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

    //注册
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    //注册页面
    @RequestMapping("/userregister")
    public String userRegister(User user){
        int row = userService.register(user);
        if(row > 0){
            return "index";
        }
        return "error";
    }

    // 登录
    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpSession session, Model model) {
        //获取提交的账号和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user = userService.login(username,password);
        System.out.println(user);
        // session.setAttribute("user",user);
        //将查询出的用户信息添加带请求域中
        model.addAttribute("user",user);
        //判断是否存在这个用户
        if ( user != null){
            //修改这个用户的登录状态
            user.setIslogin(true);
            //将这个用户放入session域
            UserSession.setUserSession(user);
            return "success";
        }
        return "error";
    }

    // 玩游戏
    @RequestMapping("/toplay")
    public String play(Model model){
        //如果用户未登录则不能玩游戏
        if(!user.getIslogin()){
            return "fail";
        }
        model.addAttribute("user",user);
        userService.play(user);
        return "play";
    }

    //登出
    @RequestMapping("/logout")
    public String logout(){
        //用户登出，修改相应状态
        userService.logout(user.getUserId());
        user.setIslogin(false);
        return "logout";
    }

    // 查看当前用户的游戏角色
    @RequestMapping("/getUserPlayers")
    public String getPlayers(HttpServletRequest request){
        List<Player> userPlayers = userService.getUserPlayers(user.getUserId());
        request.setAttribute("userPlayers",userPlayers);
        return "user-players";
    }
}
