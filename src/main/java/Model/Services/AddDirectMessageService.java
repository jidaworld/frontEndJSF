package Model.Services;

import Model.RequestManager;
import Model.ResponseObjects.AddDirectMessageResponseObject;
import Model.ViewModels.DirectMessageViewModel;

import java.io.IOException;

public class AddDirectMessageService {

    public DirectMessageViewModel AddDirectMessage(String senderEmail, String receiverEmail, String message){

        try(RequestManager.Request request = RequestManager.request()){
            request.executePost("Http://localhost:8080/writedirectmessage", new DirectMessageObject(senderEmail, receiverEmail, message));
            AddDirectMessageResponseObject responseObject = request.response(AddDirectMessageResponseObject.class);
            DirectMessageViewModel m = new DirectMessageViewModel(
                    responseObject.getSenderEmail(),
                    responseObject.getReceiverEmail(),
                    responseObject.getMessage(),
                    responseObject.getDate());
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
