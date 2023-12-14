package spring.project.data;

import java.io.Serializable;

@Entity
public class UserEntity implements Serializable {
    private String firstName;
    private String lastName;
    private Integer id;


    public String getCreationTime(){
        return creationTime;
    }

    public String setCreationTime(String creationTime){
        this.creationTime = getCreationTime;
    }



    public UserEntity(){

    }

    public UserEntity(String firstName, String lastName, Integer id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}