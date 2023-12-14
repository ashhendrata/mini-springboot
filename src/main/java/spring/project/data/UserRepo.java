package spring.project.data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, String>{
    UserEntity findByFirstName(String firstName);
    void deleteByFirstName(String firstName);


}
