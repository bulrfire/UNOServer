package com.bulefire.unoserver.var;

import org.springframework.stereotype.Component;

//对局信息记录
@Component
public class Match {
    private static int player;      // 用户标识
    private static int playerNumber;// 玩家总数
    private static String color;    // 颜色
    private static int number;      // 点数
    private static boolean start = false;   //游戏是否开始
    private static String model;    //模式
    private static boolean isInitialize;//是否完成初始化
    private static boolean isMaster;//是否有房主

    public boolean isIsMaster() {
        return isMaster;
    }

    public void setIsMaster(boolean isMaster) {
        Match.isMaster = isMaster;
    }

    public boolean isIsInitialize() {
        return isInitialize;
    }

    public void setIsInitialize(boolean isInitialize) {
        Match.isInitialize = isInitialize;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Match.model = model;
    }

    //魔改规则里用
    private static int maxNumber;            // 最高点数
    private static boolean canAddCardNumber; //是否可以叠加点数

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        Match.start = start;
    }

    public boolean getCanAddCardNumber() {
        return canAddCardNumber;
    }

    public void setCanAddCardNumber(boolean canAddCardNumber) {
        Match.canAddCardNumber = canAddCardNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        Match.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        Match.number = number;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        Match.maxNumber = maxNumber;
    }

    public  int getPlayerNumber() {
        return playerNumber;
    }

    public  void setPlayerNumber(int playerNumber) {
        Match.playerNumber = playerNumber;
    }

    public Match() {
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        Match.player = player;
    }
}
