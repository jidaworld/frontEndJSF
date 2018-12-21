package Model.ResponseObjects;

import Model.ViewModels.GraphViewModel;
import Model.ViewModels.UserViewModel;

import java.util.List;

public class GetGraphResponseObject {

    private String list;

    public GetGraphResponseObject(String list) {
        this.list = list;
    }

    public String getList() {
        return list;
    }
}
