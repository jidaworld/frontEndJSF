package Beans;

import Model.Services.AddDirectMessageService;
import Model.Services.GetDirectMessageService;
import Model.ViewModels.DirectMessageViewModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@ManagedBean
public class DirectMessageBean implements Serializable {

    private List<DirectMessageViewModel> list;
    private String senderEmail;
    private String receiverEmail;
    private String message;
    private AddDirectMessageService addMessageService;
    private GetDirectMessageService getMessageService;

    public void sendDirectMessage(){
        addMessageService = new AddDirectMessageService();
        list.add(addMessageService.AddDirectMessage(senderEmail, receiverEmail, message));
    }

    public void getDirectMessages(){
        getMessageService = new GetDirectMessageService();
        list = getMessageService.GetDirectMessages(senderEmail, receiverEmail);
    }

    public List<DirectMessageViewModel> getList() {
        return list;
    }

    public void setList(List<DirectMessageViewModel> list) {
        this.list = list;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
