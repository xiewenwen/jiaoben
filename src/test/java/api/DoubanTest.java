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
        //接口地址
        //String url="https://api.apiopen.top/getJoke?page=1&count=2&type=video";get请求的带参数url
        String url="https://api.apiopen.top/getJoke";
        RestClient rest=new RestClient();
        //构造请求头信息
        HashMap<String,String> headermap = new HashMap<String,String>();
        headermap.put("Content-Type", "application/json");
        //构造请求的参数信息
        JsonObject json=new JsonObject();
        json.addProperty("page", "1");
        json.addProperty("count", "2");
        json.addProperty("type","video");
        //发送post请求
        closeableHttpResponse=rest.post(url,json.toString(),headermap);
        //获取接口返回状态码
        int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
        System.out.println("the code is:"+statusCode);
        //获取接口的返回内容
        String responseString = EntityUtils.toString(closeableHttpResponse.getEntity());
        System.out.println("the response is:"+responseString);



    }
}
