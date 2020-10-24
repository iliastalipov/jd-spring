package cyber.services;

import cyber.interfaces.Course;
import cyber.interfaces.ExtraSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component

public class Java implements Course {


    /*
    //Field Injection Qualifier
    @Autowired
    @Qualifier("officeHours")
    */
    private  ExtraSession extraSession;



    // Constructor Injection Qualifier
    @Autowired
    public Java(@Qualifier("officeHours") ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours: "+(20+extraSession.getHours()));

    }

}
