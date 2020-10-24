package cyber.services;

import cyber.interfaces.Course;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component

public class Java implements Course {

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours: "+20);

    }

}
