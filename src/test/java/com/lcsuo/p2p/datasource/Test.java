package com.lcsuo.p2p.datasource;

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
import com.lcsuo.p2p.collect.datasource.DataSource;
import com.lcsuo.p2p.collect.datasource.WdzjDataSource;
import com.lcsuo.p2p.collect.entity.P2p;

public class Test {

	public static void main(String[] args) {
	
		DataSource dataSource = new WdzjDataSource();
		List<P2p>  listP2p = dataSource.search("http://www.wdzj.com/dangan");
		for (P2p p2p : listP2p) {
			System.out.println(p2p.getPlatName());
		}
		
	}

}
