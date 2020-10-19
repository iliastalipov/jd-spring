import interfaces.Mentor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;


public class CyberApp {
    public static void main(String[] args) {
//        BeanFactory container =new ClassPathXmlApplicationContext("config.xml");
//
//        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");
//        mentor.createAccount();

        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor = container.getBean("partTimeMentor", Mentor.class);
        mentor.createAccount();



    }
}
