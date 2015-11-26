package com.lcsuo.p2p.datasource;

import java.io.IOException;

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

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(30 * 1000)
				.setConnectTimeout(30 * 1000).setSocketTimeout(30 * 1000).build();
		CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
		HttpUriRequest request = null;
		request = new HttpGet("http://www.wdzj.com/front_select-plat");
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
	}

}
