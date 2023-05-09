package com.macheng.dao.impl;

import com.macheng.dao.PlayerDao;
import com.macheng.mapper.PlayerMapper;
import com.macheng.pojo.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :PlayerDaoImpl
 * @date ：2023/5/8 20:20
 * @description：TODO
 */
@Repository
public class PlayerDaoImpl implements PlayerDao {

    @Autowired
    PlayerMapper playerMapper;
    @Override
    public Integer addPlayer(Player player) {
        return null;
    }

    @Override
    public Integer deletePlayer(String playerName) {
        return null;
    }

    @Override
    public Integer updatePlayer(String playerName) {
        return null;
    }

    @Override
    public Player getPlayerByName(String playerName) {
        return null;
    }

    @Override
    public List<Player> getAllPlayer() {
        List<Player> allPlayer = playerMapper.getAllPlayer();
        return allPlayer;
    }
}
