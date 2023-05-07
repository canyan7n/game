package com.macheng.service;

import com.macheng.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    /**
     * 注册用户
     * @param user
     * @return
     */
    public Integer register(User user);

    /**
     * 登录，根据用户名和密码登录
     * @return
     */
    public User login(String username, String password);

    /**
     * 登录以后玩游戏
     */
    public void play();

    /**
     * 玩游戏以后，可以退出
     */
    public void logout(Integer userId);
}
