package com.macheng.controller;

import com.macheng.pojo.Weapon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.crypto.interfaces.PBEKey;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :WeaponController
 * @date ：2023/5/8 19:24
 * @description：TODO
 */
@Controller
public class WeaponController {
    @RequestMapping("/addweapon")
    public String addWeapon(Weapon weapon){
        return null;
    }

    @RequestMapping("/deleteweapon")
    public String deleteWeapon(String weaponName){
        return null;
    }

    @RequestMapping("/updateweapon")
    public String updateWeapon(String weaponName){
        return null;
    }

    @RequestMapping("/getweapon")
    public String getWeapon(String weaponName){
        return null;
    }

    @RequestMapping("/getweapons")
    public String getWeapons(){
        return null;
    }
}

