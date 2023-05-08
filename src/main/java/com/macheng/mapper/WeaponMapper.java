package com.macheng.mapper;

import com.macheng.pojo.Weapon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :WeaponMapper
 * @date ：2023/5/8 15:29
 * @description：TODO
 */
public interface WeaponMapper {
    /**
     * 添加武器
     * @param weapon
     * @return
     */
    Integer addWeapon(@Param("weapon") Weapon weapon);

    /**
     * 根据武器名删除武器
     *
     * @param weaponName
     * @return
     */
    Integer deleteWeapon(@Param("weaponName") String weaponName);

    /**
     * 根据武器名修改武器信息
     *
     * @param weaponName
     * @return
     */
    Integer updateWeapon(@Param("weaponName") String weaponName);

    /**
     * 根据武器名查询武器信息
     *
     * @param weaponName
     * @return
     */
    Weapon getWeaponByName(@Param("weaponName") String weaponName);

    /**
     * 查询所有武器信息
     * @return
     */
    List<Weapon> getAllWeapon();
}
