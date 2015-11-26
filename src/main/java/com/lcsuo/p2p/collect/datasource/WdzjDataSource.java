package com.lcsuo.p2p.collect.datasource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lcsuo.p2p.collect.entity.P2p;


public class WdzjDataSource implements DataSource {
	
	   private static final String ACCEPT = "text/html, */*; q=0.01";
	    private static final String ENCODING = "gzip, deflate";
	    private static final String LANGUAGE = "zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3";
	    private static final String CONNECTION = "keep-alive";
	    private static final String HOST = "www.baidu.com";
	    private static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:31.0) Gecko/20100101 Firefox/31.0";


	public List<P2p> search(String url) {
		 List<P2p> evidences = new ArrayList<P2p>();
			RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(30 * 1000)
					.setConnectTimeout(30 * 1000).setSocketTimeout(30 * 1000).build();
			CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
			HttpUriRequest request = null;
			request = new HttpPost("http://www.wdzj.com/dangan");
			CloseableHttpResponse response = null;
			try {
				// 发起请求
				response = client.execute(request);
				int resultCode = response.getStatusLine().getStatusCode();
				HttpEntity entity = response.getEntity();
				String resultJson = EntityUtils.toString(entity, "UTF-8");
				// 返回码200，请求成功；其他情况都为请求出现错误
				if (HttpStatus.SC_OK == resultCode) {
					System.out.println(resultJson);
				} else {
					
				}
			} catch (ClientProtocolException e) {
			} catch (IOException e) {
			} catch (Exception e) {
			} finally {
				if (null != request && !request.isAborted()) {
					request.abort();
				}
				HttpClientUtils.closeQuietly(client);
				HttpClientUtils.closeQuietly(response);
			}
		 
		return null;
	}

}
