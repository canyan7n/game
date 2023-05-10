package com.macheng.controller;

import com.macheng.pojo.Mu;
import com.macheng.pojo.Weapon;
import com.macheng.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.crypto.interfaces.PBEKey;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :WeaponController
 * @date ：2023/5/8 19:24
 * @description：TODO
 */
@Controller
public class WeaponController {

    @Autowired
    WeaponService weaponService;
    @RequestMapping(value = "/addWeaponPre",method = RequestMethod.GET)
    public String addWeaponPre(){
        return "/weapon/add-weapon";
    }

    @RequestMapping(value = "/addWeaponPost",method = RequestMethod.POST)
    public String addWeaponPost(Mu weapon){
        System.out.println(weapon);
        Integer row = weaponService.addWeapon(weapon);
        if (row > 0){
            return "redirect:/getWeapons";
        }
        return "error";
    }
    @RequestMapping("/deleteWeapon/{weaponId}")
    public String deleteWeapon(@PathVariable Integer weaponId){
        Integer row = weaponService.deleteWeapon(weaponId);
        if (row > 0){
            return "redirect:weapon-list";
        }
        return "error";
    }

    @RequestMapping("/updateWeaponPre")
    public String updateWeaponPre(Integer weaponId){
        return null;
    }

    @RequestMapping("/updateWeaponPost")
    public String updateWeaponPost(Integer weaponId){
        return null;
    }

    @RequestMapping("/getWeapon")
    public String getWeapon(String weaponName){
        return null;
    }

    @RequestMapping("/getWeapons")
    public String getWeapons(HttpServletRequest request){
        List<Weapon> allWeapon = weaponService.getWeapons();
        System.out.println("=====" + allWeapon);
        request.setAttribute("allWeapon",allWeapon);
        return "/weapon/weapon-list";
    }
}

