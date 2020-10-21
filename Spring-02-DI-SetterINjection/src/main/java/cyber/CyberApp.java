package cyber;

import cyber.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyberApp {

    public static void main(String[] args) {

        ApplicationContext container =new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("Selenium", Course.class);

        course.getTeachingHours();
    }
}
