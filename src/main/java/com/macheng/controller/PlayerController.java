package com.macheng.controller;

import com.macheng.pojo.Player;
import com.macheng.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :PlayerController
 * @date ：2023/5/8 15:40
 * @description：TODO
 */
@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;

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
    public String getPlayers(HttpServletRequest request){
        Collection<Player> allPlayer = playerService.getAllPlayer();
        System.out.println("========" + allPlayer);
        request.setAttribute("allPlayer",allPlayer);
        return "/player-list";
    }
}
