package Model.Services;

import Model.RequestManager;
import Model.ResponseObjects.GetUserResponseObject;
import Model.ViewModels.UserViewModel;

import java.io.IOException;
import java.util.List;

public class GetUsersService {

    public List<UserViewModel> getUsers(String name){
        try (RequestManager.Request request = RequestManager.request()){
            request.executePost("http://192.168.99.100:8081/getusers", new GetUsersObj(name));
            return request.response(GetUserResponseObject.class).getList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static class GetUsersObj{
        private String name;

        private GetUsersObj(String name) {
            this.name = name;
        }
    }
}
