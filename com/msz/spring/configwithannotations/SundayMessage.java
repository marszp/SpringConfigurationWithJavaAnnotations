package com.msz.spring.configwithannotations;


import org.springframework.stereotype.Component;

@Component
public class SundayMessage implements Message {
    @Override
    public String getMessage() {
        return "Sunday super happy message :) ";
    }
}
