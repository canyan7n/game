package com.macheng.service;

import com.macheng.pojo.Player;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PlayerService {

    /**
     * 添加角色
     *
     * @param player
     * @return
     */
    Integer addPlayer(Player player);

    /**
     * 根据角色id删除角色
     * @param playerId
     * @return
     */
    Integer deletePlayer(Integer playerId);

    /**
     * 修改角色
     * @param player
     * @return
     */
    Integer updatePlayer(Player player);

    /**
     * 根据角色名查询角色
     * @param playerName
     * @return
     */
    Player getPlayerByName(String playerName);

    /**
     * 查询所有角色
     * @return
     */
    List<Player> getAllPlayer();
}
