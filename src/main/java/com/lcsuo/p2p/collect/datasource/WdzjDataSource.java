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
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lcsuo.p2p.collect.entity.P2p;
import com.lcsuo.p2p.collect.entity.WdzjPage;

/**
 * 网贷之家的p2p数据 http://www.wdzj.com/dangan
 * 
 * @author jacky
 *
 */
public class WdzjDataSource implements DataSource {

	/**
	 * 查询page对象
	 */
	public WdzjPage search(String url) {
		RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(30 * 1000)
				.setConnectTimeout(30 * 1000).setSocketTimeout(30 * 1000).build();
		CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
		HttpUriRequest request = null;
		request = new HttpGet(url);
		CloseableHttpResponse response = null;
		WdzjPage wdzjPage = null;
		try {
			// 发起请求
			response = client.execute(request);
			int resultCode = response.getStatusLine().getStatusCode();
			HttpEntity entity = response.getEntity();
			String resultJson = EntityUtils.toString(entity, "UTF-8");
			// 返回码200，请求成功；其他情况都为请求出现错误
			if (HttpStatus.SC_OK == resultCode) {
				JSONObject object = JSONObject.parseObject(resultJson);
				Integer pageCount = object.getIntValue("pageCount");
				Integer rowCount = object.getIntValue("rowCount");
				String rankingMonth = object.getString("rankingMonth");
				wdzjPage = new WdzjPage(rankingMonth, rowCount, pageCount);
				// 调用list
				wdzjPage.setList(search(2, url));
			}
			return wdzjPage;
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

	/**
	 * 查询p2p集合
	 * 
	 * @param url
	 * @param pageCount
	 * @return
	 */
	public List<P2p> search(int pageCount, String url) {
		List<P2p> evidencesList = new ArrayList<P2p>();
		for (int i = 1; i < pageCount + 1; i++) {
			RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(30 * 1000)
					.setConnectTimeout(30 * 1000).setSocketTimeout(30 * 1000).build();
			CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
			HttpUriRequest request = null;
			CloseableHttpResponse response = null;
			try {
				request = new HttpGet(url + "?currPage=" + i + "&params=&sort=0");
				// 发起请求
				response = client.execute(request);
				int resultCode = response.getStatusLine().getStatusCode();
				HttpEntity entity = response.getEntity();
				String resultJson = EntityUtils.toString(entity, "UTF-8");
				// 返回码200，请求成功；其他情况都为请求出现错误
				if (HttpStatus.SC_OK == resultCode) {
					System.out.println(resultJson);
					JSONObject object = JSONObject.parseObject(resultJson);
					JSONArray arrly = object.getJSONArray("list");
					evidencesList.addAll(arrly.parseArray(arrly.toString(), P2p.class));
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
		}
		return evidencesList;
	}

}
