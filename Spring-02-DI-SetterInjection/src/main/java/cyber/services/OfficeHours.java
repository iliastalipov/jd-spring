package cyber.services;

import cyber.interfaces.ExtraSession;

public class OfficeHours implements ExtraSession {

    public int getHours(){
        return 5;
    }
}
