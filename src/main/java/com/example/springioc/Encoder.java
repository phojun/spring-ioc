package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class Encoder { //DI개념 적용

    private IEncoder iEncoder;

    public Encoder( IEncoder iEncoder){
        //this.iEncoder = new Base64Encoder();
        this.iEncoder = iEncoder;
    }

    public void setiEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){

        return iEncoder.encode(message);
    }
}

@Configuration
class AppConfig {

    @Bean("base64Encode")
    public Encoder encoder(Base64Encoder base64Encoder){
        return new Encoder(base64Encoder);
    }

    @Bean("urlEncode")
    public Encoder encoder(UrlEncoder urlEncoder){
        return new Encoder(urlEncoder);
    }

}