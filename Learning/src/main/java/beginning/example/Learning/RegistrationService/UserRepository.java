package beginning.example.Learning.RegistrationService;

public interface UserRepository {
    void save(User user);
     void PrintOut();
     User findEmail(String email);
}
