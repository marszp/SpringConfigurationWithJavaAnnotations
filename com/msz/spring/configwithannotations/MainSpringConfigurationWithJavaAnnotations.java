package com.msz.spring.configwithannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringConfigurationWithJavaAnnotations {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaAnnotationConfig.class);

        Message SundayMessage = context.getBean("sundayMessage",Message.class);
        CalendarDay Calendar = context.getBean("calendar",CalendarDay.class);

        System.out.println(SundayMessage.getMessage());
        System.out.println(Calendar.getActualDay());
        System.out.println(Calendar.getMessage());


        context.close();

    }
}
