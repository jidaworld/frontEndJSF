package Beans;


import Model.Services.AddGraphService;
import Model.Services.GetGraphService;
import Model.ViewModels.GraphViewModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class GraphBean implements Serializable {

    private int[] yValue = new int[10];
    private AddGraphService graphService = new AddGraphService();
    private GetGraphService getGraphService = new GetGraphService();
    private String email;
    private List<GraphViewModel> graphLinks = new ArrayList<>();
    private String links = "";

    public void AddGraph(){
        graphService.AddGraph(yValue, email);

    }

    public void getMyGraphs(){
        System.out.println(email);
        getGraphService.getGraphObjects(email);
        System.out.println("links");
    }

    public int[] getyValue() {
        return yValue;
    }

    public void setyValue(int[] yValue) {
        this.yValue = yValue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GraphViewModel> getGraphLinks() {
        return graphLinks;
    }

    public void setGraphLinks(List<GraphViewModel> graphLinks) {
        this.graphLinks = graphLinks;

    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }
}
