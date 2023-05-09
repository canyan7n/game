package com.macheng.dao;

import com.macheng.pojo.Player;
import com.macheng.pojo.User;

import java.util.List;

public interface UserDao {

    /**
     * 注册
     * @param user
     * @return
     */
    public Integer register(User user);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password);

    /**
     * 玩游戏
     * @param user
     */
    public void play(User user);

    /**
     * 根据用户id退出用户登录
     * @param userId
     */
    public void logout(Integer userId);

    /**
     * 根据用户id获取用户的游戏角色
     * @param userId
     * @return
     */
    public List<Player> getUserPlayers(Integer userId);
}
