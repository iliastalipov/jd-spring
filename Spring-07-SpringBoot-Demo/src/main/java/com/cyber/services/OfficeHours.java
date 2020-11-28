package com.cyber.services;

import com.cyber.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {


    @Override
    public int getOfficeHours() {
        return 50;
    }
}
