package beginning.example.Learning;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService  implements  NotificationService{
    @Override
    public void message() {
        System.out.println("welcome to spring boot");
        System.out.println("via email");
    }
}
