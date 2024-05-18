package com.bulefire.unoserver;

import com.bulefire.unoserver.var.CardNumber;
import com.bulefire.unoserver.var.Match;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Index {
    public static Match match = new Match();
    public static CardNumber cardNumber = new CardNumber();

    public static void main(String[] args) {
        SpringApplication.run(Index.class,args);
    }
}
