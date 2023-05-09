package com.macheng.controller;

import com.macheng.pojo.Player;
import com.macheng.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping (value = "/addPlayerPre",method = RequestMethod.GET)
    public String addPlayer(){
        return "/player/add-Player";
    }

    @RequestMapping(value = "/addPlayerPost",method = RequestMethod.POST)
    public String addPlayer_(Player player){
        Integer row = playerService.addPlayer(player);
        if(row > 0){
            return "redirect:/getPlayers";
        }
        return "error";
    }

    @RequestMapping("/deletePlayer/{playerId}")
    public String deletePlayer(@PathVariable Integer playerId){
        Integer row = playerService.deletePlayer(playerId);
        if(row > 0){
            return "redirect:/getPlayers";
        }
        return "error";
    }

    @RequestMapping("/updatePlayerPre/{playerId}")
    public String updatePlayer(@PathVariable Integer playerId,HttpServletRequest request){
        request.setAttribute("playerId",playerId);
        return "/player/update-player";
    }
    @RequestMapping("/updatePlayerPost")
    public String updatePlayer_(Player player){
        System.out.println(player);
        Integer row = playerService.updatePlayer(player);
        if(row > 0){
            return "redirect:/getPlayers";
        }
        return "error";
    }

    @RequestMapping("/getPlayer")
    public String getPlayer(){
        return null;
    }

    @RequestMapping("getPlayers")
    public String getPlayers(HttpServletRequest request){
        Collection<Player> allPlayer = playerService.getAllPlayer();
        request.setAttribute("allPlayer",allPlayer);
        return "/player/player-list";
    }
}
