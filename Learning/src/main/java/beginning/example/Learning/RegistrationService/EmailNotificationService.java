package beginning.example.Learning.RegistrationService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{
    @Value("${mail.host}")
    private String host;
    @Value("${mail.port}")
    private int port;
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println(message);
        System.out.println(recipientEmail);
        System.out.println(host);
        System.out.println(port);
    }
}
