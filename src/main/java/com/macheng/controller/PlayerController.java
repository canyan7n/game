package com.macheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :PlayerController
 * @date ：2023/5/8 15:40
 * @description：TODO
 */
@Controller
public class PlayerController {

    @RequestMapping("/addPlayer")
    public String addPlayer(){
        return null;
    }

    @RequestMapping("/deletePlayer")
    public String deletePlayer(){
        return null;
    }

    @RequestMapping("/updatePlayer")
    public String updatePlayer(){
        return null;
    }

    @RequestMapping("/getPlayer")
    public String getPlayer(){
        return null;
    }

    @RequestMapping("getPlayers")
    public String getPlayers(){
        return null;
    }
}
