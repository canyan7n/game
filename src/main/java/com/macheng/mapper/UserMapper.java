package com.macheng.mapper;

import com.macheng.pojo.Player;
import com.macheng.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper {

    /*
     * 注册用户
     */
    Integer register(@Param("user") User user);
    /**
     * 根据用户名和密码获取用户信息
     * @return
     */
    User getUserByUP(@Param("username") String username, @Param("password") String password);

    /**
     * 用户登录状态改变
     * @param userId
     * @return
     */
    Integer loginChange(@Param("userId") Integer userId);
    /**
     * 用户退出改变状态
     * @return
     */
    Integer logoutChange(@Param("userId") Integer userId, @Param("lastLogin") String lastLogin);

    /**
     * 根据用户获取用户的所有游戏角色
     * @param userId
     * @return
     */
    List<Player> getUserPlayers(@Param("userId") Integer userId);
}
