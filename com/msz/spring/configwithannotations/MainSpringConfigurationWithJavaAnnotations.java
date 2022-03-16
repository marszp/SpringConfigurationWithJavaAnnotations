package com.msz.spring.configwithannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringConfigurationWithJavaAnnotations {
    public static void main(String[] args) {

        //old way -> Xml file
        //ClassPathXmlApplicationContext context =
        //        new ClassPathXmlApplicationContext("applicationContextOld.xml");

        //new way -> Java annotations
        AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(JavaAnnotationConfig.class);

        //getting Beans
        Message SundayMessage = context.getBean("sundayMessage",Message.class);
        CalendarDay Calendar = context.getBean("calendar",CalendarDay.class);

        //Calling methods on bean
        System.out.println(SundayMessage.getMessage());
        System.out.println(Calendar.getActualDay());
        System.out.println(Calendar.getMessage());

        //cleaning
        context.close();
    }
}
