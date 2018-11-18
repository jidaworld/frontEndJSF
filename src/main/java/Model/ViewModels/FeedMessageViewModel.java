package Model.ViewModels;

import java.util.Date;

public class FeedMessageViewModel {

    private String name;
    private String lastname;
    private Date date;
    private String message;

    public FeedMessageViewModel(String name, String lastname, Date date, String message) {
        this.name = name;
        this.lastname = lastname;
        this.date = date;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }
}
