package com.example.springioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component("base74Encoder")//spring컨테이너에 제어권을 넘김 (IoC) -> spring컨테이너에서 제어권을 넘겨받아 Bean으로 관리
public class Base64Encoder implements IEncoder{

    public Base64Encoder() {

    }

    public String encode(String message){

        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
