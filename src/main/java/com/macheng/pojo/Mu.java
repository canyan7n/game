package com.macheng.pojo;

import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @description：TODO 木剑 伤害为20
 * @date ：2023/3/12 17:46
 */

@Component("mu")
public class Mu implements Weapon {

    //木剑的伤害
//    @Value("20")
    private Integer damage;//武器伤害值

//    @Value("木剑")
    private String name; //武器名字
    public Mu() {
    }

    public Mu(Integer damage, String name) {
        this.damage = damage;
        this.name = name;
    }



    @Override
    public Integer hurt() {
        return damage;
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
