package com.macheng.mapper;

import com.macheng.pojo.Player;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayerMapper {

    /**
     * 添加角色
     * @param player
     * @return
     */
    Integer addPlayer(@Param("player") Player player);

    /**
     * 添加完角色 同步到userdata
     * @param player
     * @return
     */
    Integer addPlayerToData(@Param("player") Player player);

    /**
     * 根据角色id删除角色
     * @param playerId
     * @return
     */
    Integer DeletePlayer(@Param("playerId") Integer playerId);

    /**
     * 根据角色id删除角色同步到userdata
     * @param playerId
     * @return
     */
    Integer DeletePlayerToData(@Param("playerId") Integer playerId);

    /**
     * 修改角色信息
     * @param player
     * @return
     */
    Integer UpdatePlayer(@Param("player") Player player);

    /**
     * 修改角色信息同步到userdata
     * @param player
     * @return
     */
    Integer UpdatePlayerToData(@Param("player") Player player);

    /**
     * 根据用户id查询用户的角色
     * @param userId
     * @return
     */
    Player getPlayerByUId(@Param("userId") Integer userId);

    /**
     * 根据角色名查询角色信息
     * @param playerName
     * @return
     */
    Player getPlayerByName(@Param("playerName") String playerName);

    /**
     * 查询所有角色信息
     * @return
     */
    List<Player> getAllPlayer();
}
