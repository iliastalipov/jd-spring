package cyber.services;

import cyber.interfaces.Course;
import lombok.Data;

@Data

public class Java implements Course {

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours: "+20);

    }
    public void myInitMethod(){
        System.out.println("Executing init Method");
    }

    public void myDestroyMethod(){
        System.out.println("Executing destroy method");
    }
}
