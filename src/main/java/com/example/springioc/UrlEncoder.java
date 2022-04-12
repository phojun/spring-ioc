package com.example.springioc;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Component("urlEncoder")//spring컨테이너에 제어권을 넘김 (IoC) -> spring컨테이너에서 제어권을 넘겨받아 Bean으로 관리
public class UrlEncoder implements IEncoder{

    public String encode(String message){
        try {
            return URLEncoder.encode(message,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
