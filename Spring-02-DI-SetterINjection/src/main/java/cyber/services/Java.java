package cyber.services;

import cyber.interfaces.Course;
import cyber.interfaces.ExtraSession;
import lombok.Data;

@Data

public class Java implements Course {


private ExtraSession extraSession;

//    public OfficeHours getOfficeHours() {
//        return officeHours;
//    }
//
//    public void setOfficeHours(OfficeHours officeHours) {  // set +officeHours
//        this.officeHours = officeHours;
//    }
    @Override
    public void getTeachingHours() {

//        System.out.println("Weekly Teaching Hours: "+(20+ officeHours.getHours()));
        System.out.println("Weekly Teaching Hours: "+(20+ extraSession.getHours()));

    }
}
