package com.msz.spring.configwithannotations;

public class Calendar implements CalendarDay {

    private Message theSundayMessage;
    private static final String Day = "Monday";

    public String getDay(){
        return Day;
    }

    public Calendar(Message tempSundayMessage){
        theSundayMessage = tempSundayMessage;
    }

    @Override
    public String getActualDay() {
        return "Today day is " + getDay();
    }

    @Override
    public String getMessage() {
        return theSundayMessage.getMessage();
    }
}
