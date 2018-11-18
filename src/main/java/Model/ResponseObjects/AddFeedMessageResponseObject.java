package Model.ResponseObjects;

import Model.ViewModels.FeedMessageViewModel;

import java.util.Date;

public class AddFeedMessageResponseObject {

    private String message;
    private Date date;
    private String name;
    private String lastName;

    public AddFeedMessageResponseObject(FeedMessageViewModel message) {
        this.message = message.getMessage();
        this.date = message.getDate();
        this.name = message.getName();
        this.lastName = message.getLastname();
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
