package com.msz.spring.configwithannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;


public class MainSpringConfigurationWithJavaAnnotations {



    public static void main(String[] args) {

        //old way -> Xml file
        //ClassPathXmlApplicationContext context =
        //        new ClassPathXmlApplicationContext("applicationContextOld.xml");

        //other way -> Java annotations
        //another way -> Java Component Scanning

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
