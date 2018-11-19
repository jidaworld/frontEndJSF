package Model.ResponseObjects;

import Model.ViewModels.DirectMessageViewModel;

import java.util.List;

public class GetDirectMessageResponseObject {

    private List<DirectMessageViewModel> list;

    public GetDirectMessageResponseObject(List<DirectMessageViewModel> list) {
        this.list = list;
    }

    public List<DirectMessageViewModel> getList() {
        return list;
    }
}
