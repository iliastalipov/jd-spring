package cyber.services;

import cyber.interfaces.Course;
import cyber.interfaces.ExtraSession;

public class Java implements Course {

//    OfficeHours officeHours;
    ExtraSession extraSession;

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    @Override
    public void getTeachingHours() {

//        System.out.println("Weekly Teaching Hours: "+(20+ officeHours.getHours()));
        System.out.println("Weekly Teaching Hours: "+(20+ extraSession.getHours()));
    }
}
