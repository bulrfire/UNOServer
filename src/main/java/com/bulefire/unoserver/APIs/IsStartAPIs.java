package com.bulefire.unoserver.APIs;

import com.bulefire.unoserver.Index;
import com.bulefire.unoserver.var.Match;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//刷新请求类
@Component
@RestController
public class IsStartAPIs {

    private static Match match = Index.match;

    //请求开始游戏
    @RequestMapping("/api/get/isStart")
    public ResponseEntity<Object> startGame() {
        if (match.isStart()){
            return ResponseEntity.ok().body(match.isStart() + String.valueOf(match.getPlayer()));
        }else {
            return ResponseEntity.noContent().build();
        }
    }
}
