package com.bulefire.unoserver.logic;

import com.bulefire.unoserver.Index;
import com.bulefire.unoserver.var.CardNumber;
import com.bulefire.unoserver.var.Match;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
//初始化类
public class Initialize {
    public static Match match = Index.match;
    public static CardNumber cd = Index.cardNumber;

    //model合法性检查
    private static boolean isModelGood(String model){
        if (model.equals("normal") || model.equals("hard")){
            return true;
        }
        return false;
    }

    //判断模式
    public static boolean whichModule(String module,int playerNumber) {
        if (!isModelGood(module)){
            return false;
        }
        switch (module) {
            case "normal":
                ordinaryModel(playerNumber);
                return true;
        }
        return false;
    }

    //一般模式
    private static void ordinaryModel(int playerNumber){
        Random r = new Random();
        match.setColor(null);
        match.setNumber(-1);
        match.setPlayer(r.nextInt(1,playerNumber+1));
        match.setPlayerNumber(playerNumber);
        match.setCanAddCardNumber(false);
        cd.setMaxCardNumber(9);
        match.setIsInitialize(true);
    }
}
