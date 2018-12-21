package Model.ViewModels;

public class GraphViewModel {

    private String email;

    private String link;

    public GraphViewModel(String email, String link) {
        this.email = email;
        this.link = link;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
