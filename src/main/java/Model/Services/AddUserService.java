package Model.Services;

import Model.RequestManager;

import java.io.IOException;


public class AddUserService {

    public void addUser(String UserName, String Password, String Email, String Name, String LastName){

        try(RequestManager.Request request = RequestManager.request()){
            request.executePost("http://192.168.99.100:8081/adduser", new AddUserObj(UserName, Password, Email, Name, LastName));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static class AddUserObj{

        private String username;
        private String password;
        private String email;
        private String name;
        private String lastname;

        private AddUserObj(String userName, String password, String email, String name, String lastName) {
            this.username = userName;
            this.password = password;
            this.email = email;
            this.name = name;
            this.lastname = lastName;
        }
    }
}
