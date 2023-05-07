package com.macheng.service.impl;

import com.macheng.dao.UserDao;
import com.macheng.pojo.User;
import com.macheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

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
     UserDao userDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public Integer register(User user) {
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
    public void play() {

        userDao.play();
    }

    /**
     * 退出登录
     * @param userId
     */
    @Override
    public void logout(Integer userId) {
        userDao.logout(userId);
    }
}
