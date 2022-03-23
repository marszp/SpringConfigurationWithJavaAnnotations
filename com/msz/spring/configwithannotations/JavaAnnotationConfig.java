package com.msz.spring.configwithannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Scanning for components
@ComponentScan("com.msz.spring.configwithannotations")
public class JavaAnnotationConfig {

    /*
    @Bean
    public Message sundayMessage() {return new SundayMessage();}

    @Bean
    public CalendarDay calendar(){return new Calendar(sundayMessage());}

*/

}
