package com.msz.spring.configwithannotations;

public class SundayMessage implements Message {
    @Override
    public String getMessage() {
        return "Sunday super happy message :) ";
    }
}
