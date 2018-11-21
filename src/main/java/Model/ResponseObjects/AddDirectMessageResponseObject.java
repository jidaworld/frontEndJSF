package Model.ResponseObjects;

import Model.ViewModels.DirectMessageViewModel;

import java.util.Date;

public class AddDirectMessageResponseObject {

    private String message;
    private Date date;
    private String senderName;
    private String receiverName;

    public AddDirectMessageResponseObject(String message, Date date, String senderName, String receiverName) {
        this.message = message;
        this.date = date;
        this.senderName = senderName;
        this.receiverName = receiverName;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }
}
