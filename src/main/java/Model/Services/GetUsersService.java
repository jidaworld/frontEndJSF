package Model.Services;

import Model.UserViewModel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class GetUsersService {

    HttpURLConnection http = null;

    public List<UserViewModel> getUsers(String name){
        try{
            URL url = new URL("http://Localhost:8080/getusers");
            http = (HttpURLConnection) url.openConnection();

        } catch (IOException e) {

        } finally {
            if(http != null) {
                http.disconnect();
            }
        }

       return null;
    }
}
