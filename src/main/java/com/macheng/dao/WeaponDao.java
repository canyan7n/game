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
     * 添加武器同步到playerdata
     * @param weapon
     * @return
     */
    Integer addWeaponToData(Weapon weapon);

    /**
     * 根据武器id删除武器
     * @param weaponId
     * @return
     */
    Integer deleteWeapon(Integer weaponId);

    /**
     * 根据武器id删除武器同步到playerdata
     * @param weaponId
     * @return
     */
    Integer deleteWeaponToData(Integer weaponId);

    /**
     * 根据武器id修改武器
     * @param weapon
     * @return
     */
    Integer updateWeapon(Weapon weapon);

    /**
     * 根据武器id修改武器同步到playerdata
     * @param weapon
     * @return
     */
    Integer updateWeaponToData(Weapon weapon);

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
