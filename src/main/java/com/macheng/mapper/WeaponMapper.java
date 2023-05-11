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
     * 添加武器同步到playerdata
     * @param weapon
     * @return
     */
    Integer addWeaponToData(@Param("weapon") Weapon weapon);

    /**
     * 根据武器id删除武器
     *
     * @param weaponId
     * @return
     */
    Integer deleteWeapon(@Param("weaponId") Integer weaponId);

    /**
     * 根据武器id删除武器同步到playerdata
     * @param weaponId
     * @return
     */
    Integer deleteWeaponToData(@Param("weaponId") Integer weaponId);

    /**
     * 根据武器id修改武器信息
     *
     * @param weapon
     * @return
     */
    Integer updateWeapon(@Param("weapon") Weapon weapon);

    /**
     * 根据武器id修改武器信息同步到playerdata
     *
     * @param weapon
     * @return
     */
    Integer updateWeaponToData(@Param("weapon") Weapon weapon);

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
