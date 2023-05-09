package com.macheng.service;

import com.macheng.pojo.Player;
import com.macheng.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    public void play(User user);

    /**
     * 玩游戏以后，可以退出
     */
    public void logout(Integer userId);

    /**
     * 根据用户id获取用户的所有游戏角色
     * @param userId
     * @return
     */
    public List<Player> getUserPlayers(Integer userId);
}
