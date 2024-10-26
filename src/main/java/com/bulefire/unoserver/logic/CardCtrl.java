package com.bulefire.unoserver.logic;

import com.bulefire.unoserver.Index;
import com.bulefire.unoserver.var.CardNumber;
import com.bulefire.unoserver.var.Match;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class CardCtrl {
    //引入对局
    public static Match m = Index.match;
    public static CardNumber cd = Index.cardNumber;
    //开始
    public static boolean start(String did, int player, String color, int number){
        if (!m.isStart()){
            return false;
        }
        //判断数据是否合法
        if (isCan(did,player,color,number)){
            //返回是否成功
            return updateMatch(player,color,number);
        }
        return false;
    }

    //更新对局数据
    public static boolean updateMatch(int player, String color, int number){
        //更新玩家数
        if (player < m.getPlayerNumber()){
            m.setPlayer(player+1);
            //System.out.println("1更新玩家为：" + m.getPlayer());
        } else if (player == m.getPlayerNumber()) {
            m.setPlayer(1);
            //System.out.println("2更新玩家为：" + m.getPlayer());
        }else{
            //System.out.println("????????");
            return false;
        }
        //更新颜色
        if (color.equals("GREEN") || color.equals("RED") || color.equals("BLUE") || color.equals("YELLOW")) {
            m.setColor(color);
            //System.out.println("更新颜色：" + m.getColor());
        }else{
            //System.out.println("~~~~~~~~~~~");
            return false;
        }
        //更新点数
        if (m.getCanAddCardNumber()){
            m.setNumber(m.getNumber() + number);
        } else if (!m.getCanAddCardNumber()) {
        m.setNumber(number);
        }
        //更新牌数
        switch (color){
            case "GREEN":
                cd.setOrdinaryCardGreen(cd.getOrdinaryCardGreen() - 1);
                break;
            case "RED":
                cd.setOrdinaryCardRed(cd.getOrdinaryCardRed() - 1);
                break;
            case "BLUE":
                cd.setOrdinaryCardBlue(cd.getOrdinaryCardBlue() - 1);
                break;
            case "YELLOW":
                cd.setOrdinaryCardYellow(cd.getOrdinaryCardYellow() - 1);
                break;
        }
        //System.out.println("更新点数为：" + m.getNumber());
        return true;
    }
    //判断是否可以出牌
    public static boolean isCan(String did, int player, String color, int number){
        //判断是否为第一个数
        if (m.getPlayerNumber() == -1){
            return true;
        }
        if (m.getColor() == null){
            return true;
        }
        //判断颜色是否合法
        if (!(color.equals("GREEN") || color.equals("RED") || color.equals("BLUE") || color.equals("YELLOW"))){
            //System.out.println("不合法颜色");
            return false;
        }
        //判断 特殊牌
        if (!(did.equals("Rollback") || did.equals("Forbid") || did.equals("Add2") || did.equals("Universal") || did.equals("UniversalAdd4"))){
            return false;
        }
        //判断是否有牌
        if (color.equals("GREEN")){
            if (cd.getOrdinaryCardGreen() == 0){
                return false;
            }
        }
        if (color.equals("RED")){
            if (cd.getOrdinaryCardRed() == 0){
                return false;
            }
        }
        if (color.equals("BLUE")){
            if (cd.getOrdinaryCardBlue() == 0){
                return false;
            }
        }
        if (color.equals("YELLOW")){
            if (cd.getOrdinaryCardYellow() == 0){
                return false;
            }
        }
        //TODO 添加特殊牌检查
        //判断   玩家是否正确          与           颜色是否正确       或           点数是否正确
        if (player == m.getPlayer() && (color.equals(m.getColor()) || number == m.getNumber())){
            //System.out.println("合法数据");
            return true;
        }
        //判断点数是否合法
        if (number >= cd.getMaxCardNumber()){
            return false;
        }

        //System.out.println("非法数据");
        return false;
    }
}
