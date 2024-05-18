package com.bulefire.unoserver.logic;

import com.bulefire.unoserver.Index;
import com.bulefire.unoserver.var.Match;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//判断是否开始游戏
@Component
@Service
public class StartGame {
    //当前加入玩家
    public static int playerNow = 0;
    //引入对局
    private static Match match = Index.match;

    public static boolean startGame(){
        if(!match.isIsMaster()){
            return false;
        }
        //玩家+1
        playerNow++;
        //人数是否达标
        if (playerNow == match.getPlayerNumber()){
            match.setStart(true);
            return true;
        }else if(playerNow > match.getPlayerNumber()){
            return false;
        }else if(playerNow < match.getPlayerNumber()){
            return true;
        }
        return false;
    }
}
