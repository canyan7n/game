package com.macheng.pojo;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：macheng
 * @ClassName ：User
 * @date ：2023/4/16 11:20
 * @description：用户类
 */
@Component
public class User {

    private Integer userId; //用户id

    private String username; //用户名

    private String password; //用户密码

    private String accountType; //账户类型

    private String lastLogin; //上次登录时间

    private Boolean islogin; //当前登录状态

    private List<Player> players; //游戏角色列表

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountType='" + accountType + '\'' +
                ", lastLogin='" + lastLogin + '\'' +
                ", islogin=" + islogin +
                ", players=" + players +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getIslogin() {
        return islogin;
    }

    public void setIslogin(Boolean islogin) {
        this.islogin = islogin;
    }

    public User(Integer userId, String username, String password, String accountType, String lastLogin, Boolean islogin) {
        this.userId = -1;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.lastLogin = lastLogin;
        this.islogin = islogin;
    }

    public User() {
    }
}
