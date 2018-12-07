package Model.Services;

import Model.RequestManager;
import Model.ResponseObjects.LoginResponseObject;

import java.io.IOException;

public class LoginService {

    public boolean loginUser(String email, String password){

        try (RequestManager.Request request = RequestManager.request()){
            request.executePost("http://192.168.99.100:8081/login", new LoginObj(email, password));
            return request.response(LoginResponseObject.class).isSuccessful();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static class LoginObj{

        private String email;
        private String password;

        public LoginObj(String email, String password) {
            this.email = email;
            this.password = password;
        }
    }
}
