package com.macheng.mapper;

import com.macheng.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


public interface UserMapper {

    /*
     * 注册用户
     */
    public Integer register(@Param("user") User user);
    /**
     * 根据用户名和密码获取用户信息
     * @return
     */
    public User getUserByUP(@Param("username") String username, @Param("password") String password);

    /**
     * 用户登录状态改变
     * @param userId
     * @return
     */
    public Integer loginChange(@Param("userId") Integer userId);
    /**
     * 用户退出改变状态
     * @return
     */
    public Integer logoutChange(@Param("userId") Integer userId, @Param("lastLogin") String lastLogin);
}
