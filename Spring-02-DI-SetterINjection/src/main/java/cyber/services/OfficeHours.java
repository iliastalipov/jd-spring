package cyber.services;

import cyber.interfaces.ExtraSession;

public class OfficeHours implements ExtraSession {
    @Override
    public int getHours() {
        return 5;
    }
}
