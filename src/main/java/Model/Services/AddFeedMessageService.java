package Model.Services;

import Model.RequestManager;
import Model.ResponseObjects.AddFeedMessageResponseObject;
import Model.ViewModels.FeedMessageViewModel;

import java.io.IOException;

public class AddFeedMessageService {

    public FeedMessageViewModel addFeedMessage(String email1, String Message){

        String message = "pls work";
        String email = "kaspe@kth.se";

        try (RequestManager.Request request = RequestManager.request()){
            request.executePost("Http://localhost:8080/writefeedmessage", new FeedMessageObj(message, email));
            FeedMessageViewModel m = new FeedMessageViewModel(
                    request.response(AddFeedMessageResponseObject.class).getName(),
                    request.response(AddFeedMessageResponseObject.class).getLastName(),
                    request.response(AddFeedMessageResponseObject.class).getDate(),
                    request.response(AddFeedMessageResponseObject.class).getMessage());

            return m;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static class FeedMessageObj{

        private String message;
        private String email;

        public FeedMessageObj(String message, String email) {
            this.message = message;
            this.email = email;
        }
    }
}
