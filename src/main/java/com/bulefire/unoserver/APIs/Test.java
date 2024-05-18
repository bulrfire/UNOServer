package com.bulefire.unoserver.APIs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/api/test")
    String a() {
        return "Hello";
    }

    @RequestMapping("/api/a")
    public ResponseEntity<Object> registerUser(@RequestBody UserRegistrationRequest request) {
        // 这里是对请求体进行验证、处理逻辑...
        if (request.getA().equals("a")) {
            // 返回响应
            String message = "User registered successfully!";
            return ResponseEntity.ok(message);
        }
        return ResponseEntity.ok("400");
    }

    // 定义请求体数据结构
    public static class UserRegistrationRequest {
        private String a;
        private String b;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

    }
}
