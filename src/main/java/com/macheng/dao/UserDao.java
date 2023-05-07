package com.macheng.dao;

import com.macheng.pojo.User;

public interface UserDao {

    public Integer register(User user);

    public User login(String username, String password);

    public void play();

    public void logout(Integer userId);
}
