package com.macheng.dao.impl;

import com.macheng.dao.WeaponDao;
import com.macheng.pojo.Weapon;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :WeaponDaoImpl
 * @date ：2023/5/8 20:20
 * @description：TODO
 */
@Repository
public class WeaponDaoImpl implements WeaponDao {
    @Override
    public Integer addWeapon(Weapon weapon) {
        return null;
    }

    @Override
    public Integer deleteWeapon(String weaponName) {
        return null;
    }

    @Override
    public Integer updateWeapon(String weaponName) {
        return null;
    }

    @Override
    public Weapon getWeaponByName(String weaponName) {
        return null;
    }

    @Override
    public List<Weapon> getWeapons() {
        return null;
    }
}
