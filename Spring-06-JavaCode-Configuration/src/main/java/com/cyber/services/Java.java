package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {

    private ExtraSession extraSession;

    public Java(ExtraSession extraSession){
        this.extraSession= extraSession;
    }
    public void getTeachingHours() {
        System.out.println("Teaching Hours "+(10+extraSession.getHours()));
    }

    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String [] days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
