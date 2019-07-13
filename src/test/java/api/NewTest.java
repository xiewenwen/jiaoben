package api;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeClass;

public class NewTest {
	CloseableHttpResponse closeableHttpResponse;
  @Test
  public void f() throws ClientProtocolException, IOException {
	  String url="https://gaia.wentiduoduo.com/login/gaia";
	  RestClient rest=new RestClient();
	  HashMap<String,String> headermap = new HashMap<String,String>();
	  headermap.put("Content-Type", "application/json");
//	  User user=new User("13555555555","1qazxc");
//	  String userJsonString = JSON.toJSONString(user);
	  JsonObject json=new JsonObject();
	  json.addProperty("username", "13555555555");
	  json.addProperty("password", "1qazxc");
	  closeableHttpResponse=rest.post(url,json.toString(), headermap);
	  int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
	  System.out.println("状态号码是======="+statusCode);
	  String responseString = EntityUtils.toString(closeableHttpResponse.getEntity());
	  //JSONObject responseJson = JSON.parseObject(responseString);
	  System.out.println("返回的请求是====="+responseString);
  }
  @BeforeClass
  public void beforeClass() {
	  
  }

}
