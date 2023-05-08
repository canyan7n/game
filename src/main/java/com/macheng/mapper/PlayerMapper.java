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
     * 根据角色名删除角色
     * @param playerName
     * @return
     */
    Integer DeletePlayer(@Param("playerName") String playerName);

    /**
     * 根据角色名修改角色信息
     * @param playerName
     * @return
     */
    Integer UpdatePlayer(@Param("playerName") String playerName);

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
