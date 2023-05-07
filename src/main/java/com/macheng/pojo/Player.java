package com.macheng.pojo;

import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @date ：2023/3/12 17:47
 * @description：TODO 玩家
 */

@Component
public class Player {

//    @Autowired //自动装配，给wuqi属性赋值
//    @Value("角色1")
    private String playName; //角色名字
//    @Qualifier("mo")
    private Weapon weapon;  //角色的装备

    private Integer userId; //哪个用户选择了这种角色

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    //返回攻击后造成的伤害
    public Integer play(){
        System.out.print("玩家"+ /*userId +*/ "在攻击");
        Integer damage = weapon.hurt();
        System.out.println(",-" + damage);
        return damage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playName='" + playName + '\'' +
                ", weapon=" + weapon +
                ", userId=" + userId +
                '}';
    }
}
