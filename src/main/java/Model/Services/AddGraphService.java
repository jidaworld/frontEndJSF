package Model.Services;

import Model.RequestManager;
import Model.ResponseObjects.AddGraphObject;

import java.io.IOException;

public class AddGraphService {

    public void AddGraph(int[] yValue, String email) {
        try (RequestManager.Request request = RequestManager.request()) {
            request.executePost("Http://localhost:8085/api/graph", new AddGraphObject(yValue, email));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
