package cyber.services;

import cyber.interfaces.Course;
import cyber.interfaces.ExtraSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component

public class Java implements Course {


    @Autowired
    private ExtraSession extraSession;

    //Field Injection
 /*   @Autowired
    private OfficeHours officeHours;

    public  OfficeHours getOfficeHours(){
        return officeHours;
    }
  */

    /*
    //    Constructor Injection
        @Autowired
        public Java(OfficeHours officeHours) {
            this.officeHours = officeHours;
        }

      //   Setter Injection
        @Autowired
        public void setOfficeHours(OfficeHours officeHours) {
            this.officeHours = officeHours;
        }

    */

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours: " + (30 + extraSession.getHours()));

    }

}
