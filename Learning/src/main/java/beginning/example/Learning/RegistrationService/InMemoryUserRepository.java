package beginning.example.Learning.RegistrationService;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository{
    HashMap<String , User>users = new HashMap<>();
    @Override
    public void save(User user) {
        users.put(user.getEmail() , user);
    }
    @Override
    public void PrintOut() {
        for (Map.Entry<String, User> entry : users.entrySet()) {
            String k = entry.getKey();
            User value = entry.getValue();
            System.out.println(k + ": " + value.getName() + "|" + value.getPassword());
        }
    }

    @Override
    public User findEmail(String email) {
        return users.getOrDefault(email , null);
    }

}
