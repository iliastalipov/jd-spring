package com.cyber.services;

import com.cyber.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {
    public void getTeachingHours() {
        System.out.println("Teaching Hours: 30");
    }
    @PostConstruct
    public void postConstract(){
        System.out.println("Executing postConstract");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing preDestroy");
    }
}
