package Model;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.io.InputStreamReader;

public class RequestManager {

    private static final PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
    private static final CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(connectionManager).build();
    private static final Gson gson = new Gson();

    private RequestManager() {
    }


    public static Request request(){


        return new Request();
    }

    public static class Request implements AutoCloseable{

        private final HttpContext context;
        private CloseableHttpResponse response = null;

        public Request(){
            this.context = HttpClientContext.create();
        }

        public void close() throws IOException {
            if(response != null){
                response.close();
            }
        }

        public int executePost(String dir, Object body) throws IOException {
            HttpPost post = new HttpPost(dir);

            String json = gson.toJson(body);
            HttpEntity stringEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
            post.setEntity(stringEntity);
            response = httpClient.execute(post, context);

            return response.getStatusLine().getStatusCode();
        }

        public <T> T response(Class<T> t) throws IOException {
            if (response != null) {
                return gson.fromJson(new InputStreamReader(response.getEntity().getContent()), t);
            } else {
                throw new IOException("lagg");
            }
        }
    }


}

