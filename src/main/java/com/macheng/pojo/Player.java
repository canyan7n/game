package com.macheng.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：macheng
 * @date ：2023/3/12 17:47
 * @description：TODO 玩家
 */

@Component
@Data
public class Player {
    private String playerName; //角色名字

    private Integer weaponId;//武器id

    private Weapon weapons;  //角色的装备

    private Integer playerId;//角色id,自增主键

    private Integer userId; //哪个用户选择了这种角色
    //返回攻击后造成的伤害
/*    public Integer play(){
        System.out.print("玩家"+ *//*userId +*//* "在攻击");
        Integer damage = weapons.get(0).hurt();
        System.out.println(",-" + damage);
        return damage;
    }*/
}
