package com.macheng.dao.impl;

import com.macheng.dao.UserDao;
import com.macheng.mapper.PlayerMapper;
import com.macheng.mapper.UserMapper;
import com.macheng.pojo.Monster;
import com.macheng.pojo.Player;
import com.macheng.pojo.User;
import com.macheng.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :UserDaoImpl
 * @date ：2023/4/21 18:22
 * @description：TODO
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    UserMapper userMapper;
    @Autowired
    PlayerMapper playerMapper;
    @Override
    public Integer register(User user) {
        Integer row = userMapper.register(user);//注册用户将用户信息写进数据库
        return row;//写入成功返回影响的行数
    }
    @Override
    public User login(String username, String password) {
        try{
            User user = userMapper.getUserByUP(username, password);//登录，先查询用户
            userMapper.loginChange(user.getUserId());//修改用户的的登录状态
            return user;//返回查询到的用户
        }catch (Exception e){
            e.getStackTrace();
            return null;//查询不到返回null
        }
    }
    @Override
    public void play(User user) {}
    @Override
    public void logout(Integer userId) {
        String lastLogin = TimeUtil.getCurrentTime();//获取当前时间
        userMapper.logoutChange(userId, lastLogin);// 修改退出的用户的状态
    }
    @Override
    public List<Player> getUserPlayers(Integer userId) {
        List<Player> userPlayers = userMapper.getUserPlayers(userId);
        return userPlayers;
    }
}
