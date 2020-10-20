package cyber;

import cyber.interfaces.Course;
import cyber.services.Java;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyberApp {

    public static void main(String[] args) {

        ApplicationContext container =new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("Java", Course.class);

        course.getTeachingHours();
    }
}
