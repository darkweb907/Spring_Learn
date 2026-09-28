package beginning.example.Learning.RegistrationService;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;
    NotificationService notificationService;
    public  UserService(UserRepository userRepository, NotificationService notificationService ){
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }
    public void register(User user){
        if(userRepository.findEmail(user.getEmail()) != null){
            throw new IllegalArgumentException();
        }
        userRepository.save(user);

        notificationService.send("registered successfully", user.getEmail());
    }
}
