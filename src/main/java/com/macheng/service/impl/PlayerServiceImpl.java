package com.macheng.service.impl;

import com.macheng.dao.PlayerDao;
import com.macheng.pojo.Player;
import com.macheng.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :PlayerServiceImpl
 * @date ：2023/5/8 20:15
 * @description：TODO
 */
@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    protected PlayerDao playerDao;
    @Override
    public Integer addPlayer(Player player) {
        Integer row = playerDao.addPlayer(player);
        return row;
    }

    @Override
    public Integer addPlayerToData(Player player) {
        Integer row = playerDao.addPlayerToData(player);
        return row;
    }

    @Override
    public Integer deletePlayer(Integer playerId) {
        Integer row = playerDao.deletePlayer(playerId);
        return row;
    }

    @Override
    public Integer deletePlayerToData(Integer playerId) {
        Integer row = playerDao.deletePlayerToData(playerId);
        return row;
    }

    @Override
    public Integer updatePlayer(Player player) {
        Integer row = playerDao.updatePlayer(player);
        return row;
    }

    @Override
    public Integer updatePlayerToData(Player player) {
        Integer row = playerDao.updatePlayerToData(player);
        return row;
    }

    @Override
    public Player getPlayerByName(String playerName) {
        return null;
    }

    @Override
    public List<Player> getAllPlayer() {
        List<Player> allPlayer = playerDao.getAllPlayer();
        return allPlayer;
    }
}
