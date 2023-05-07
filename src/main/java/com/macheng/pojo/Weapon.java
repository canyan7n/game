package com.macheng.pojo;

/**
 * @author: macheng
 * @date: 2023/3/12 18:46
 * @description: TODO 武器接口，有不同的伤害
 */
public interface Weapon {
    //武器造成伤害，由子类实现
    public Integer hurt();
}
