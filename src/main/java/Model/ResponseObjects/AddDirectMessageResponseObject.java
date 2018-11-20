package Model.ResponseObjects;

import Model.ViewModels.DirectMessageViewModel;

import java.util.Date;

public class AddDirectMessageResponseObject {

    private String message;
    private Date date;
    private String senderEmail;
    private String receiverEmail;

    public AddDirectMessageResponseObject(DirectMessageViewModel model) {
        this.message = model.getMessage();
        this.date = model.getDate();
        this.senderEmail = model.getSenderEmail();
        this.receiverEmail = model.getReceiverEmail();
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }
}
