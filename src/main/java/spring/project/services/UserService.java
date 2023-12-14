package spring.project.services;
import spring.project.model.UserModel;

public interface UserService {
    UserModel getUser(String userName);
    void addUser(UserModel userName);
    void deleteUser(String userName);
}
