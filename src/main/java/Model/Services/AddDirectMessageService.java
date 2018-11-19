package Model.Services;

import Model.RequestManager;
import Model.ResponseObjects.AddDirectMessageResponseObject;
import Model.ViewModels.DirectMessageViewModel;

import java.io.IOException;

public class AddDirectMessageService {

    public DirectMessageViewModel AddDirectMessage(String senderEmail, String receiverEmail, String message){

        try(RequestManager.Request request = RequestManager.request()){
            request.executePost("Http://localhost:8080/writedirectmessages", new DirectMessageObject(senderEmail, receiverEmail, message));
            DirectMessageViewModel m = new DirectMessageViewModel(
                    request.response(AddDirectMessageResponseObject.class).getSenderEmail(),
                    request.response(AddDirectMessageResponseObject.class).getReceiverEmail(),
                    request.response(AddDirectMessageResponseObject.class).getMessage(),
                    request.response(AddDirectMessageResponseObject.class).getDate()
            );
            return m;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static class DirectMessageObject {

        private String senderEmail;
        private String receiverEmail;
        private String message;

        public DirectMessageObject(String senderEmail, String receiverEmail, String message) {
            this.senderEmail = senderEmail;
            this.receiverEmail = receiverEmail;
            this.message = message;
        }
    }
}
