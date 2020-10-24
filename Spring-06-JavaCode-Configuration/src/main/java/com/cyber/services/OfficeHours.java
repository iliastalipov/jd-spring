package com.cyber.services;

import com.cyber.interfaces.ExtraSession;

public class OfficeHours implements ExtraSession {

    @Override
    public int getHours() {
        return 30;
    }
}
