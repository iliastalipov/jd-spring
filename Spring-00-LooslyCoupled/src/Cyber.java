import services.FullTimeMentor;
import services.MentorAccount;
import services.PartTimeMentor;

public class Cyber {
    public static void main(String[] args) {

//        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor =new PartTimeMentor();
        MentorAccount mentor = new   MentorAccount(partTimeMentor);

        mentor.manageAccount();

    }
}
