package com.macheng.pojo;

import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @description：TODO 魔剑 伤害为100
 * @date ：2023/3/12 17:46
 */

@Component("mo")
public class Mo implements Weapon {

    //魔剑的伤害
//    @Value("100")
    private Integer weaponDamage;//武器伤害值

//    @Value("魔剑")
    private String weaponName;//武器名字

    public Mo() {
    }

    public Mo(Integer damage, String weaponName) {
        this.weaponDamage = damage;
        this.weaponName = weaponName;
    }

    public Integer getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(Integer weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }



    @Override
    public Integer hurt() {
        return weaponDamage;
    }
}
