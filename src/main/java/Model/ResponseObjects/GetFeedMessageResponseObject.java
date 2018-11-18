package Model.ResponseObjects;

import Model.ViewModels.FeedMessageViewModel;

import java.util.List;

public class GetFeedMessageResponseObject {

    private List<FeedMessageViewModel> list;

    public GetFeedMessageResponseObject(List<FeedMessageViewModel> list) {
        this.list = list;
    }

    public List<FeedMessageViewModel> getList() {
        return list;
    }
}
