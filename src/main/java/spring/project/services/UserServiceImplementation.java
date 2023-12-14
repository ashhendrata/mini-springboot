package spring.project.services;
import org.springframework.stereotype.Service;
import spring.project.data.UserRepo;
import spring.project.model.UserModel;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;
import java.util.Map;

@Service
@Qualifier("primary")
public class UserServiceImplementation implements UserService{
    private final Time time;

    private UserRepo userRepo;

    public UserServiceImplementation(Time time, UserRepo userRepo){
        this.time = time;
        userMap.put("Ashley", new UserModel("Ashley", "Hendrata", 2003));
        userMap.put("Brendan", new UserModel("Brendan", "Hendrata", 2005));
    }

    public UserModel getUser(String userName) {
        return userRepo.findByFirstName(userName);
    }

    public void addUser(UserModel user){
        user.setCreationTime(time.getCurrentTime("Hamilton"));
        userRepo.save();
    }

    public void deleteUser(String userName){
        userRepo.deleteByFirstName(userName);
    }



}
