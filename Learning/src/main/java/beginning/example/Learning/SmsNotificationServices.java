package beginning.example.Learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SmsNotificationServices implements NotificationService{
    @Override
    public void message() {
        System.out.println("welcome to spring boot");
        System.out.println("via SMS Message");
    }
}
