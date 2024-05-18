package com.bulefire.unoserver.logic;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;

public class JsonTest {
    public static void main(String[] args) {
//        Demo001 d = new Demo001();
//        d.setFlag(true);
//
//        String text =  JSON.toJSONString(d);
//
//        System.out.println(text);

        try{
            //读json
            FileInputStream fis = new FileInputStream("src/main/java/com/bulefire/unoserver/data/test.json");
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            fis.close();

            // 将JSON字符串转换为JSONObject
            JSONObject jsonObject = JSON.parseObject(new String(bytes));
            String out = jsonObject.getString("a");
            System.out.println(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
