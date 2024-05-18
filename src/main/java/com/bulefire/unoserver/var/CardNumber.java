package com.bulefire.unoserver.var;

import org.springframework.stereotype.Component;

//全局信息
@Component
public class CardNumber {
    //全部
    private static int all;
    //普通牌
    private static int ordinaryCard;
    //特殊牌
    private static int specialCard;

    //普通数字牌
    private static int ordinaryCardRed;
    private static int ordinaryCardBlue;
    private static int ordinaryCardYellow;
    private static int ordinaryCardGreen;

    //反转
    private static int specialCardRollback;
    private static int specialCardRollbackRed;
    private static int specialCardRollbackBlue;
    private static int specialCardRollbackYellow;
    private static int specialCardRollbackGreen;

    //禁止
    private static int specialCardForbid;
    private static int specialCardForbidRed;
    private static int specialCardForbidBlue;
    private static int specialCardForbidYellow;
    private static int specialCardForbidGreen;

    //+2牌
    private static int specialCardRollbackAdd2;
    private static int specialCardRollbackAdd2Red;
    private static int specialCardRollbackAdd2Blue;
    private static int specialCardRollbackAdd2Yellow;
    private static int specialCardRollbackAdd2Green;

    //调色盘
    private static int specialCardUniversal;
    //调色盘 + +4
    private static int specialCardUniversalAdd4;

    //单张最大点数
    private static int maxCardNumber;

    //总最大累计点数
    private static int maxAllCardNumber;

    //构造器
    public CardNumber(){

    }



    public CardNumber(int all,
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

        setAll(all);
        setOrdinaryCard(ordinaryCard);
        setSpecialCard(specialCard);
        setOrdinaryCardRed(ordinaryCardRed);
        setOrdinaryCardBlue(ordinaryCardBlue);
        setOrdinaryCardYellow(ordinaryCardYellow);
        setOrdinaryCardGreen(ordinaryCardGreen);
        setSpecialCardRollback(specialCardRollback);
        setSpecialCardRollbackRed(specialCardRollbackRed);
        setSpecialCardRollbackBlue(specialCardRollbackBlue);
        setSpecialCardRollbackYellow(specialCardRollbackYellow);
        setSpecialCardRollbackGreen(specialCardRollbackGreen);
        setSpecialCardForbid(specialCardForbid);
        setSpecialCardForbidRed(specialCardForbidRed);
        setSpecialCardForbidBlue(specialCardForbidBlue);
        setSpecialCardForbidYellow(specialCardForbidYellow);
        setSpecialCardForbidGreen(specialCardForbidGreen);
        setSpecialCardRollbackAdd2(specialCardRollbackAdd2);
        setSpecialCardRollbackAdd2Red(specialCardRollbackAdd2Red);
        setSpecialCardRollbackAdd2Blue(specialCardRollbackAdd2Blue);
        setSpecialCardRollbackAdd2Yellow(specialCardRollbackAdd2Yellow);
        setSpecialCardRollbackAdd2Green(specialCardRollbackAdd2Green);
        setSpecialCardUniversal(specialCardUniversal);
        setSpecialCardUniversalAdd4(specialCardUniversalAdd4);
        setMaxCardNumber(maxCardNumber);
        setMaxAllCardNumber(maxAllCardNumber);

    }


    //Getter and Setter...
    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        CardNumber.all = all;
    }

    public int getOrdinaryCard() {
        return ordinaryCard;
    }

    public void setOrdinaryCard(int ordinaryCard) {
        CardNumber.ordinaryCard = ordinaryCard;
    }

    public int getSpecialCard() {
        return specialCard;
    }

    public void setSpecialCard(int specialCard) {
        CardNumber.specialCard = specialCard;
    }

    public int getOrdinaryCardRed() {
        return ordinaryCardRed;
    }

    public void setOrdinaryCardRed(int ordinaryCardRed) {
        CardNumber.ordinaryCardRed = ordinaryCardRed;
    }

    public int getOrdinaryCardBlue() {
        return ordinaryCardBlue;
    }

    public void setOrdinaryCardBlue(int ordinaryCardBlue) {
        CardNumber.ordinaryCardBlue = ordinaryCardBlue;
    }

    public int getOrdinaryCardYellow() {
        return ordinaryCardYellow;
    }

    public void setOrdinaryCardYellow(int ordinaryCardYellow) {
        CardNumber.ordinaryCardYellow = ordinaryCardYellow;
    }

    public int getOrdinaryCardGreen() {
        return ordinaryCardGreen;
    }

    public void setOrdinaryCardGreen(int ordinaryCardGreen) {
        CardNumber.ordinaryCardGreen = ordinaryCardGreen;
    }

    public int getSpecialCardRollback() {
        return specialCardRollback;
    }

    public void setSpecialCardRollback(int specialCardRollback) {
        CardNumber.specialCardRollback = specialCardRollback;
    }

    public int getSpecialCardRollbackRed() {
        return specialCardRollbackRed;
    }

    public void setSpecialCardRollbackRed(int specialCardRollbackRed) {
        CardNumber.specialCardRollbackRed = specialCardRollbackRed;
    }

    public int getSpecialCardRollbackBlue() {
        return specialCardRollbackBlue;
    }

    public void setSpecialCardRollbackBlue(int specialCardRollbackBlue) {
        CardNumber.specialCardRollbackBlue = specialCardRollbackBlue;
    }

    public int getSpecialCardRollbackYellow() {
        return specialCardRollbackYellow;
    }

    public void setSpecialCardRollbackYellow(int specialCardRollbackYellow) {
        CardNumber.specialCardRollbackYellow = specialCardRollbackYellow;
    }

    public int getSpecialCardRollbackGreen() {
        return specialCardRollbackGreen;
    }

    public void setSpecialCardRollbackGreen(int specialCardRollbackGreen) {
        CardNumber.specialCardRollbackGreen = specialCardRollbackGreen;
    }

    public int getSpecialCardForbid() {
        return specialCardForbid;
    }

    public void setSpecialCardForbid(int specialCardForbid) {
        CardNumber.specialCardForbid = specialCardForbid;
    }

    public int getSpecialCardForbidRed() {
        return specialCardForbidRed;
    }

    public void setSpecialCardForbidRed(int specialCardForbidRed) {
        CardNumber.specialCardForbidRed = specialCardForbidRed;
    }

    public int getSpecialCardForbidBlue() {
        return specialCardForbidBlue;
    }

    public void setSpecialCardForbidBlue(int specialCardForbidBlue) {
        CardNumber.specialCardForbidBlue = specialCardForbidBlue;
    }

    public int getSpecialCardForbidYellow() {
        return specialCardForbidYellow;
    }

    public void setSpecialCardForbidYellow(int specialCardForbidYellow) {
        CardNumber.specialCardForbidYellow = specialCardForbidYellow;
    }

    public int getSpecialCardForbidGreen() {
        return specialCardForbidGreen;
    }

    public void setSpecialCardForbidGreen(int specialCardForbidGreen) {
        CardNumber.specialCardForbidGreen = specialCardForbidGreen;
    }

    public int getSpecialCardRollbackAdd2() {
        return specialCardRollbackAdd2;
    }

    public void setSpecialCardRollbackAdd2(int specialCardRollbackAdd2) {
        CardNumber.specialCardRollbackAdd2 = specialCardRollbackAdd2;
    }

    public int getSpecialCardRollbackAdd2Red() {
        return specialCardRollbackAdd2Red;
    }

    public void setSpecialCardRollbackAdd2Red(int specialCardRollbackAdd2Red) {
        CardNumber.specialCardRollbackAdd2Red = specialCardRollbackAdd2Red;
    }

    public int getSpecialCardRollbackAdd2Blue() {
        return specialCardRollbackAdd2Blue;
    }

    public void setSpecialCardRollbackAdd2Blue(int specialCardRollbackAdd2Blue) {
        CardNumber.specialCardRollbackAdd2Blue = specialCardRollbackAdd2Blue;
    }

    public int getSpecialCardRollbackAdd2Yellow() {
        return specialCardRollbackAdd2Yellow;
    }

    public void setSpecialCardRollbackAdd2Yellow(int specialCardRollbackAdd2Yellow) {
        CardNumber.specialCardRollbackAdd2Yellow = specialCardRollbackAdd2Yellow;
    }

    public int getSpecialCardRollbackAdd2Green() {
        return specialCardRollbackAdd2Green;
    }

    public void setSpecialCardRollbackAdd2Green(int specialCardRollbackAdd2Green) {
        CardNumber.specialCardRollbackAdd2Green = specialCardRollbackAdd2Green;
    }

    public int getSpecialCardUniversal() {
        return specialCardUniversal;
    }

    public void setSpecialCardUniversal(int specialCardUniversal) {
        CardNumber.specialCardUniversal = specialCardUniversal;
    }

    public int getSpecialCardUniversalAdd4() {
        return specialCardUniversalAdd4;
    }

    public void setSpecialCardUniversalAdd4(int specialCardUniversalAdd4) {
        CardNumber.specialCardUniversalAdd4 = specialCardUniversalAdd4;
    }

    public static int getMaxCardNumber() {
        return maxCardNumber;
    }

    public static void setMaxCardNumber(int maxCardNumber) {
        CardNumber.maxCardNumber = maxCardNumber;
    }

    public static int getMaxAllCardNumber() {
        return maxAllCardNumber;
    }

    public static void setMaxAllCardNumber(int maxAllCardNumber) {
        CardNumber.maxAllCardNumber = maxAllCardNumber;
    }
}
