package com.macheng.dao.impl;

import com.macheng.dao.UserDao;
import com.macheng.pojo.Monster;
import com.macheng.pojo.Player;
import com.macheng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    JdbcTemplate jdbcTemplate;

    // @Autowired
    // UserDao userDao;
    @Override
    public Integer register(User user) {
        //获取当前时间
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String lastLogin = simpleDateFormat.format(date).toString();
        //设置用户的登录时间，默认未当前时间
        user.setLastLogin(lastLogin);

        //注册用户将用户信息写进数据库
        String sql = "insert into t_user values(?,?,?,?,?,0)";
        int row = jdbcTemplate.update(sql,user.getUserId(),user.getUsername(),
                user.getPassword(),user.getAccountType(),user.getLastLogin());
        //写入成功返回影响的行数
        return row;
    }

    @Override
    public User login(String username, String password) {
        BeanPropertyRowMapper<User> userRowMapper =
                new BeanPropertyRowMapper<>(User.class);
        try{
            //登录，先查询用户
            String sql1 = "select * from t_user where username = ? and password = ?";
            User user = jdbcTemplate.queryForObject(sql1, userRowMapper, username, password);
            //修改用户的的登录状态
            String sql2 = "update t_user set islogin = 1 where user_id = ?";
            jdbcTemplate.update(sql2,1);
            //返回查询到的用户
            return user;
        }catch (Exception e){
            e.getStackTrace();
            //查询不到返回null
            return null;
        }
    }

    @Override
    public void play() {

    }

    @Override
    public void logout(Integer userId) {

        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String lastLogin = simpleDateFormat.format(date).toString();

        String sql = "update t_user set islogin = ? and last_login = ? where user_id = ?";
        jdbcTemplate.update(sql,0,lastLogin,userId);
    }
}
