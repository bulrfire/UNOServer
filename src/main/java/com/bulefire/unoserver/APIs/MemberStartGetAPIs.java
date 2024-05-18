package com.bulefire.unoserver.APIs;

import com.bulefire.unoserver.logic.StartGame;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//成员请求开始游戏
@RequestMapping
@RestController
public class MemberStartGetAPIs {
    @RequestMapping("/api/get/memberStartGet")
    public ResponseEntity<Object> getMemberStartGet() {
        if (StartGame.startGame()){
        return ResponseEntity.ok().body("success please wait");
        }
        return ResponseEntity.badRequest().body("no master or too many players");
    }
}
