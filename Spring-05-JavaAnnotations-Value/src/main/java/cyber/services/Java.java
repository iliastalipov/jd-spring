package cyber.services;

import cyber.interfaces.Course;
import cyber.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component

public class Java implements Course {

    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String  instructor;

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
