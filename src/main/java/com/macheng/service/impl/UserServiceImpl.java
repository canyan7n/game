package com.macheng.service.impl;

import com.macheng.dao.UserDao;
import com.macheng.pojo.Player;
import com.macheng.pojo.User;
import com.macheng.service.UserService;
import com.macheng.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :UserServiceImpl
 * @date ：2023/4/16 11:18
 * @description：TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    protected UserDao userDao;
    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public Integer register(User user) {
        String lastLogin = TimeUtil.getCurrentTime();//获取当前时间
        user.setLastLogin(lastLogin);//设置用户的登录时间，默认未当前时间
        Integer row = userDao.register(user);
        return row;
    }
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public User login(String username, String password) {
        User user = userDao.login(username, password);
        return user;
    }
    /**
     * 玩游戏
     */
    @Override
    public void play(User user) {
        userDao.play(user);
    }

    /**
     * 退出登录
     * @param userId
     */
    @Override
    public void logout(Integer userId) {
        userDao.logout(userId);
    }

    @Override
    public List<Player> getUserPlayers(Integer userId) {
        List<Player> userPlayers = userDao.getUserPlayers(userId);
        return userPlayers;
    }
}
