package com.cyber.configs;

import com.cyber.interfaces.ExtraSession;
import com.cyber.services.Java;
import com.cyber.services.OfficeHours;
import com.cyber.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cyber")
@PropertySource("classpath:application.properties")
public class CyberAppConfig {

    @Bean
    public Java java(){
        return new Java(extraSession());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
//    @Bean
//    public OfficeHours officeHours(){
//        return new OfficeHours();
//    }

    //Polymorfic way
    @Bean
    public ExtraSession extraSession(){
        return  new OfficeHours();
    }

}
