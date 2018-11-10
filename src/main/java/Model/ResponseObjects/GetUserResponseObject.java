package Model.ResponseObjects;


import Model.ViewModels.UserViewModel;

import java.util.List;

public class GetUserResponseObject {

    private List<UserViewModel> list;

    public GetUserResponseObject(List<UserViewModel> list) {
        this.list = list;
    }

    public List<UserViewModel> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "GetUserResponseObject{" +
                "list=" + list +
                '}';
    }
}
