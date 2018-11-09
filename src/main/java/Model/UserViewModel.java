package Model;

public class UserViewModel {

    private String UserName;
    private String Email;
    private String Name;
    private String LastName;

    public UserViewModel(String UserName, String Email, String Name, String LastName){
        this.UserName = UserName;
        this.Email = Email;
        this.Name = Name;
        this.LastName = LastName;
    }

    public String getUserName() {
        return UserName;
    }

    public String getEmail() {
        return Email;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }
}

