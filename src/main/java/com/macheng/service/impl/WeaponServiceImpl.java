package com.macheng.service.impl;

import com.macheng.dao.WeaponDao;
import com.macheng.pojo.Weapon;
import com.macheng.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :WeaponServiceImpl
 * @date ：2023/5/8 20:18
 * @description：TODO
 */
@Service
public class WeaponServiceImpl implements WeaponService {

    @Autowired
    protected WeaponDao weaponDao;
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

        List<Weapon> allWeapon = weaponDao.getWeapons();
        return allWeapon;
    }
}
