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
        return null;
    }
}
