package spring.project.model;

public class UserModel {
    private String firstName;
    private String lastName;
    private Integer id;


    public String getCreationTime(){
        return creationTime;
    }

    public String setCreationTime(String creationTime){
        this.creationTime = getCreationTime;
    }



    public UserModel(){

    }

    public UserModel(String firstName, String lastName, Integer id){
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
