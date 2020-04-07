package api;

import com.google.gson.JsonObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

public class DoubanTest {
    CloseableHttpResponse closeableHttpResponse;
    @Test
    public void getMovie() throws IOException {
        String url="https://api.apiopen.top/getJoke?page=1&count=2&type=video";
        RestClient rest=new RestClient();
        HashMap<String,String> headermap = new HashMap<String,String>();
        headermap.put("Content-Type", "application/json");
        JsonObject json=new JsonObject();
        json.addProperty("apikey", "0df993c66c0c636e29ecbb5344252a4a");
        json.addProperty("start", 0);
        json.addProperty("count",10);
        //closeableHttpResponse=rest.post(url,json.toString(), headermap);
        closeableHttpResponse=rest.get(url,headermap);
        int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
        System.out.println("状态号码是======="+statusCode);
        String responseString = EntityUtils.toString(closeableHttpResponse.getEntity());
        //JSONObject responseJson = JSON.parseObject(responseString);
        System.out.println("返回的请求是====="+responseString);

        //提交代码了吗？

    }
}
