package com.macheng.pojo;

import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @description：TODO 铁剑 伤害为50
 * @date ：2023/3/12 17:46
 */

@Component("tie")
public class Tie implements Weapon {

    //铁剑的伤害
//    @Value("50")
    private Integer damage; //铁剑的伤害值

//    @Value("铁剑")
    private String name; //武器名字

    public Tie() {
    }

    public Tie(Integer damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    @Override
    public Integer hurt() {
        return damage;
    }

    @Override
    public String toString() {
        return "Tie{" +
                "damage=" + damage +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
