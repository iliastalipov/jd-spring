package cyber.services;

import cyber.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: "+15);
    }
}
