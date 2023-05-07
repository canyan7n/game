package com.macheng.pojo;

import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * 小怪血量：100
 * 精英怪血量：500
 * Boss血量：1000
 * @date ：2023/3/12 17:48
 * @description：TODO 怪物
 */

@Component
public class Monster {

//    @Value("boss")
    //怪物名字
    private String name;//怪物名字
//    @Value("1000")
    //怪物的血量
    private Integer hp;//怪物血量
    //怪物的状态
//    @Value("true")
    private Boolean state;//怪物状态

    public Monster() {
    }

    public Monster(String name, Integer hp, Boolean state) {
        this.name = name;
        this.hp = hp;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", state=" + state +
                '}';
    }

    //被攻击减少血量
    public void reduce(Integer damage){
        System.out.print("怪物在掉血");
        hp = hp - damage;
        System.out.println(":" + hp);
    }
    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Boolean getState() {
        if (hp <= 0 ){
            state = false;
        }
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
