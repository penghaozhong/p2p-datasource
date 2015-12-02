package com.lcsuo.p2p.collect.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 调用高德web api
 * @author penghaozhong
 *
 */
public class GeocodingAPI {
	
	
	/**
	 * 通过地名获取经纬度
	 * @param address
	 * @return
	 */
	public static String getLocation(String address){
		RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(30 * 1000)
				.setConnectTimeout(30 * 1000).setSocketTimeout(30 * 1000).build();
		CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
		HttpUriRequest request = null;
		request = new HttpGet("http://restapi.amap.com/v3/geocode/geo?output=json&key=20b25c8f0d224bd9749d303e842591e0&address="+address);
		CloseableHttpResponse response = null;
		try {
			// 发起请求
			response = client.execute(request);
			int resultCode = response.getStatusLine().getStatusCode();
			HttpEntity entity = response.getEntity();
			String resultJson = EntityUtils.toString(entity, "UTF-8");
			// 返回码200，请求成功；其他情况都为请求出现错误
			if (HttpStatus.SC_OK == resultCode) {
				JSONObject object = JSONObject.parseObject(resultJson);
				JSONArray geocodes = object.getJSONArray("geocodes");
				JSONObject  geocode = (JSONObject) geocodes.get(0);
				return geocode.getString("location");
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != request && !request.isAborted()) {
				request.abort();
			}
			HttpClientUtils.closeQuietly(client);
			HttpClientUtils.closeQuietly(response);
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(GeocodingAPI.getLocation("东莞市南城区新城鸿福路102号汇成大厦102A号"));
	}

}
