package Beans;

import Model.Services.AddFeedMessageService;
import Model.Services.GetFeedMessageService;
import Model.ViewModels.FeedMessageViewModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;


@ManagedBean
@SessionScoped
public class FeedMessageBean implements Serializable {

    private List<FeedMessageViewModel> list;
    private String message;
    private String name;
    private String lastname;
    private AddFeedMessageService addMessageService;
    private GetFeedMessageService getMessageService;

    public void sendFeedMessages(String email) {
        addMessageService = new AddFeedMessageService();
        FeedMessageViewModel m = addMessageService.addFeedMessage(email, message);
        if (m != null) {
            list.add(m);
            message = "";
        }

    }

    public void getFeedMessages(String email) {
        getMessageService = new GetFeedMessageService();
        list = getMessageService.getFeedMessages(email);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void clearList() {
        if (!FacesContext.getCurrentInstance().getPartialViewContext().isAjaxRequest()) {
            this.list = null;
            this.name = null;
            this.lastname = null;
        }
    }

}
