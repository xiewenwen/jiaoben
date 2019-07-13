package api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


public class RestClient {
	
	//封装一个get请求方法
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
	  //创建一个可关闭的HttpClient对象
	  CloseableHttpClient httpclient = HttpClients.createDefault();
	  //创建一个httpget对象
	  HttpGet httpget = new HttpGet(url);
	  //执行请求,相当于postman上点击发送按钮，然后赋值给HttpResponse对象接收
	  CloseableHttpResponse httpResponse = httpclient.execute(httpget);
	  //返回请求的结果
	  return httpResponse;
	  
	}
	//post方法
	public CloseableHttpResponse post(String url,String entityString,HashMap<String,String> headermap) throws ClientProtocolException, IOException{
		//创建一个httpClient对象
		CloseableHttpClient httpclient=HttpClients.createDefault();
		//创建一个httppost对象
		HttpPost httppost=new HttpPost(url);
		HttpEntity entity=new StringEntity(entityString.toLowerCase());
		//设置一个payload
		httppost.setEntity(entity);
		//加载请求头到httppost对象
		if(headermap!=null){
			for(Map.Entry<String, String> entry : headermap.entrySet()){
				httppost.addHeader(entry.getKey(), entry.getValue());
			}
		}
		//发送请求
		CloseableHttpResponse httpResponse = httpclient.execute(httppost);
		//返回请求的结果
		return httpResponse;
	}
		
	//get带请求头
	public CloseableHttpResponse get(String url,HashMap<String,String> headermap) throws ClientProtocolException, IOException{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url);
		for(Map.Entry<String, String> entry:headermap.entrySet()){
			httpget.setHeader(entry.getKey(), entry.getValue());
		}
		CloseableHttpResponse httpResponse=httpclient.execute(httpget);
		return httpResponse;
	}

		
	
	
	

}
