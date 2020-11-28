package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("{$instructor}")
    private String instructorName;

    private ExtraSession extraSession;

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public int getTeachHours() {
        return 20 + extraSession.getOfficeHours();
    }
}
