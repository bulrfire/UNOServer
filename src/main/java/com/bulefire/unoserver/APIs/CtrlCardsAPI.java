package com.bulefire.unoserver.APIs;

import com.bulefire.unoserver.Index;
import com.bulefire.unoserver.logic.CardCtrl;
import com.bulefire.unoserver.var.Match;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//卡片控制请求类
@Component
@Service
@RestController
public class CtrlCardsAPI {

    public static Match match = Index.match;

    //出牌
    @RequestMapping("/api/post/CtrlCards")
    public ResponseEntity<Object> a(@RequestBody inputCtrl input) {
        if(CardCtrl.start(input.getDid(), input.getPlayer(),input.getColor(),input.getNumber())){
            return ResponseEntity.ok().body("Success" + "下一个 玩家：" + match.getPlayer() + " 颜色：" + match.getColor() + " 点数：" + match.getNumber());
        }
        return ResponseEntity.badRequest().body("failed" + "下一个 玩家：" + match.getPlayer() + " 颜色：" + match.getColor() + " 点数：" + match.getNumber());
    }

    //请求头
    public static class inputCtrl{
        //动作
        private String did;//  out, in
        //玩家
        private int player;//  0, 1, 2, ...
        //颜色
        private String color;// GREEN, RED, ...
        //点数
        private int number;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getDid() {
            return did;
        }

        public void setDid(String did) {
            this.did = did;
        }

        public int getPlayer() {
            return player;
        }

        public void setPlayer(int player) {
            this.player = player;
        }


    }
}

