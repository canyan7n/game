package com.macheng.service;

import com.macheng.dao.WeaponDao;
import com.macheng.pojo.Weapon;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WeaponService {

    /**
     * 添加武器
     * @param weapon
     * @return
     */
    Integer addWeapon(Weapon weapon);

    /**
     * 根据武器id删除武器
     * @param weaponId
     * @return
     */
    Integer deleteWeapon(Integer weaponId);

    /**
     * 根据武器id修改武器
     * @param weaponId
     * @return
     */
    Integer updateWeapon(Integer weaponId);

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
