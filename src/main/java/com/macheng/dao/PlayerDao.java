package com.macheng.dao;

import com.macheng.pojo.Player;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PlayerDao {
    /**
     * 添加角色
     *
     * @param player
     * @return
     */
    Integer addPlayer(Player player);

    /**
     * 根据角色名删除角色
     * @param playerName
     * @return
     */
    Integer deletePlayer(String playerName);

    /**
     * 根据角色名修改角色
     * @param playerName
     * @return
     */
    Integer updatePlayer(String playerName);

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
