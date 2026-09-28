package beginning.example.Learning;

import beginning.example.Learning.RegistrationService.User;
import beginning.example.Learning.RegistrationService.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
	 ApplicationContext contex= SpringApplication.run(LearningApplication.class, args);

        var services = contex.getBean(UserService.class);
        services.register(new User(1 ,"barry@gmail.com" , "1234" , "opeyemi"));
//       var message = contex.getBean(NotificationManager.class);
//       message.sendNotification();
	}

}
