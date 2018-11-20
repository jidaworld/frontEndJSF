package Beans;

import Model.Services.AddFeedMessageService;
import Model.Services.GetFeedMessageService;
import Model.ViewModels.FeedMessageViewModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean
@SessionScoped
public class FeedMessageBean implements Serializable {

    private List<FeedMessageViewModel> list;
    private String message;
    private String email;
    private AddFeedMessageService addMessageService;
    private GetFeedMessageService getMessageService;

    public void sendFeedMessages(){
        addMessageService = new AddFeedMessageService();
        addMessageService.addFeedMessage(email, message);
    }

    public void getFeedMessages(){
        getMessageService = new GetFeedMessageService();
        list = getMessageService.getFeedMessages(email);
        System.out.println(email);

    }

    public List<FeedMessageViewModel> getList() {
        return list;
    }

    public void setList(List<FeedMessageViewModel> list) {
        this.list = list;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
