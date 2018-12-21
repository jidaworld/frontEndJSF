package Model.Services;

import Model.RequestManager;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


import java.io.IOException;
import java.util.List;

public class GetGraphService {

    private String email;

    public void getGraphObjects(String email) {
        System.out.println("kom hit");
        System.out.println(email);
        try (RequestManager.Request request = RequestManager.request()) {
            request.executePost("Http://localhost:8085/api/getgraph", email);
            //return request.response(String.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class GetGraphObj{

        private String email;

        public GetGraphObj(String email) {
            this.email = email;
        }
    }

}
