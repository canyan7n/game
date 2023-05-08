package com.macheng.dao;

import com.macheng.pojo.Weapon;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface WeaponDao {
    /**
     * 添加武器
     * @param weapon
     * @return
     */
    Integer addWeapon(Weapon weapon);

    /**
     * 根据武器名删除武器
     * @param weaponName
     * @return
     */
    Integer deleteWeapon(String weaponName);

    /**
     * 根据武器名修改武器
     * @param weaponName
     * @return
     */
    Integer updateWeapon(String weaponName);

    /**
     * 根据武器名查询武器
     * @param weaponName
     * @return
     */
    Weapon getWeaponByName(String weaponName);

    /**
     * 查询所有武器
     * @return
     */
    List<Weapon> getWeapons();
}
