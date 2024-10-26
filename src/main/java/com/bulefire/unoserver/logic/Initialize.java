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

    //初始化到空
    public static void goNull(){
        match.setPlayer(0);
        match.setPlayerNumber(-1);
        match.setColor(null);
        match.setNumber(-1);
        match.setStart(false);
        match.setModel(null);
        match.setIsMaster(false);
        match.setIsMaster(false);

    }

    //model合法性检查
    private static boolean isModelGood(String model){
        if (model.equals("normal") || model.equals("hard") || model.equals("endModel")){
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
            case "hard":
                return true;
            case "endModel":
                goNull();
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
        setCardNumber(108,76,24+8,
                10,10,10,
                10,6,2,
                2,2,2,
                6,2,2,2,
                2,6,2,2,
                2,2,4,4,
                9,9);
    }

    public static void setCardNumber(int all,
                      int ordinaryCard,
                      int specialCard,
                      int ordinaryCardRed,
                      int ordinaryCardBlue,
                      int ordinaryCardYellow,
                      int ordinaryCardGreen,
                      int specialCardRollback,
                      int specialCardRollbackRed,
                      int specialCardRollbackBlue,
                      int specialCardRollbackYellow,
                      int specialCardRollbackGreen,
                      int specialCardForbid,
                      int specialCardForbidRed,
                      int specialCardForbidBlue,
                      int specialCardForbidYellow,
                      int specialCardForbidGreen,
                      int specialCardRollbackAdd2,
                      int specialCardRollbackAdd2Red,
                      int specialCardRollbackAdd2Blue,
                      int specialCardRollbackAdd2Yellow,
                      int specialCardRollbackAdd2Green,
                      int specialCardUniversal,
                      int specialCardUniversalAdd4,
                      int maxCardNumber,
                      int maxAllCardNumber){

        cd.setAll(all);
        cd.setOrdinaryCard(ordinaryCard);
        cd.setSpecialCard(specialCard);
        cd.setOrdinaryCardRed(ordinaryCardRed);
        cd.setOrdinaryCardBlue(ordinaryCardBlue);
        cd.setOrdinaryCardYellow(ordinaryCardYellow);
        cd.setOrdinaryCardGreen(ordinaryCardGreen);
        cd.setSpecialCardRollback(specialCardRollback);
        cd.setSpecialCardRollbackRed(specialCardRollbackRed);
        cd.setSpecialCardRollbackBlue(specialCardRollbackBlue);
        cd.setSpecialCardRollbackYellow(specialCardRollbackYellow);
        cd.setSpecialCardRollbackGreen(specialCardRollbackGreen);
        cd.setSpecialCardForbid(specialCardForbid);
        cd.setSpecialCardForbidRed(specialCardForbidRed);
        cd.setSpecialCardForbidBlue(specialCardForbidBlue);
        cd.setSpecialCardForbidYellow(specialCardForbidYellow);
        cd.setSpecialCardForbidGreen(specialCardForbidGreen);
        cd.setSpecialCardRollbackAdd2(specialCardRollbackAdd2);
        cd.setSpecialCardRollbackAdd2Red(specialCardRollbackAdd2Red);
        cd.setSpecialCardRollbackAdd2Blue(specialCardRollbackAdd2Blue);
        cd.setSpecialCardRollbackAdd2Yellow(specialCardRollbackAdd2Yellow);
        cd.setSpecialCardRollbackAdd2Green(specialCardRollbackAdd2Green);
        cd.setSpecialCardUniversal(specialCardUniversal);
        cd.setSpecialCardUniversalAdd4(specialCardUniversalAdd4);
        cd.setMaxCardNumber(maxCardNumber);
        cd.setMaxAllCardNumber(maxAllCardNumber);

    }
}
