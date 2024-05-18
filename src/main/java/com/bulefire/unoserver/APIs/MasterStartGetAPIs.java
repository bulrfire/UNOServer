package com.bulefire.unoserver.APIs;

import com.bulefire.unoserver.Index;
import com.bulefire.unoserver.logic.Initialize;
import com.bulefire.unoserver.logic.StartGame;
import com.bulefire.unoserver.var.Match;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//房主(主人master（bushi)请求开始游戏
@Component
@RestController
public class MasterStartGetAPIs {

    private static Match match = Index.match;

    @RequestMapping("/api/post/masterStartGet")
    public ResponseEntity<Object> startGet(@RequestBody head h) {
        //设置玩家数
        match.setPlayerNumber(h.getPl());
        //是否需要初始化
        if (!match.isIsInitialize()){
            //初始化是否成功
            if (!Initialize.whichModule(h.getModel(),h.getPl())){
                return ResponseEntity.badRequest().body("Invalid model");
            }
        }
        //成功
        match.setIsMaster(true);
        if (StartGame.startGame()){
            return ResponseEntity.ok().body("please wait other player");
        }
        //失败
        match.setIsMaster(false);
        return ResponseEntity.badRequest().body("error");
    }
    //请求头
    public static class head{
        private static int pl;      //玩家数
        private static String model;//模式：normal:普通模式

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            head.model = model;
        }

        public int getPl() {
            return pl;
        }

        public void setPl(int pl) {
            head.pl = pl;
        }
    }
}
