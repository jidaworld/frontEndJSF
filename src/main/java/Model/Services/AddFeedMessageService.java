package Model.Services;

import Model.RequestManager;
import Model.ResponseObjects.AddFeedMessageResponseObject;
import Model.ViewModels.FeedMessageViewModel;

import java.io.IOException;

public class AddFeedMessageService {

    public FeedMessageViewModel addFeedMessage(String email, String message) {

        try (RequestManager.Request request = RequestManager.request()) {
            request.executePost("Http://localhost:8080/writefeedmessage", new FeedMessageObj(message, email));
            AddFeedMessageResponseObject responseObject = request.response(AddFeedMessageResponseObject.class);
            FeedMessageViewModel m = new FeedMessageViewModel(
                    responseObject.getName(),
                    responseObject.getLastName(),
                    responseObject.getDate(),
                    responseObject.getMessage());
            if (m.getName() != null) {
                return m;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static class FeedMessageObj {

        private String message;
        private String email;

        public FeedMessageObj(String message, String email) {
            this.message = message;
            this.email = email;
        }
    }
}
