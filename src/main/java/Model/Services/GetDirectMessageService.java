package Model.Services;

import Model.RequestManager;
import Model.ResponseObjects.GetDirectMessageResponseObject;
import Model.ViewModels.DirectMessageViewModel;

import java.io.IOException;
import java.util.List;

public class GetDirectMessageService {

    public List<DirectMessageViewModel> GetDirectMessages(String senderEmail, String receiverEmail){

        try(RequestManager.Request request = RequestManager.request()){
            request.executePost("http://192.168.99.100:8081/getdirectmessages", new GetMessageObj(senderEmail, receiverEmail));
            return request.response(GetDirectMessageResponseObject.class).getList();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static class GetMessageObj{

        private String senderEmail;
        private String receiverEmail;

        public GetMessageObj(String senderEmail, String receiverEmail) {
            this.senderEmail = senderEmail;
            this.receiverEmail = receiverEmail;
        }
    }
}
