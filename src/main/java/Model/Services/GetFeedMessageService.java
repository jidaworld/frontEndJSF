package Model.Services;

import Model.RequestManager;
import Model.ResponseObjects.GetFeedMessageResponseObject;
import Model.ViewModels.FeedMessageViewModel;

import java.io.IOException;
import java.util.List;

public class GetFeedMessageService {

    public List<FeedMessageViewModel> getFeedMessages(String email){

        try(RequestManager.Request request = RequestManager.request()){
            request.executePost("Http://localhost:8080/getfeedmessages", new GetMessagesObj(email));
            return request.response(GetFeedMessageResponseObject.class).getList();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static class GetMessagesObj{

        private String email;

        public GetMessagesObj(String email) {
            this.email = email;
        }
    }
}
