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
        Integer row = playerMapper.addPlayer(player);
        return row;
    }

    @Override
    public Integer deletePlayer(Integer playerId) {
        Integer row = playerMapper.DeletePlayer(playerId);
        return row;
    }

    @Override
    public Integer updatePlayer(Player player) {
        Integer row = playerMapper.UpdatePlayer(player);
        return row;
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
