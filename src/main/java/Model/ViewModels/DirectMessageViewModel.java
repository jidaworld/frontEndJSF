package Model.ViewModels;

import java.util.Date;

public class DirectMessageViewModel {

    private String senderEmail;
    private String receiverEmail;
    private String message;
    private Date date;

    public DirectMessageViewModel(String senderEmail, String receiverEmail, String message, Date date) {
        this.senderEmail = senderEmail;
        this.receiverEmail = receiverEmail;
        this.message = message;
        this.date = date;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
