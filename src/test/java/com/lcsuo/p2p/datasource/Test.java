package com.lcsuo.p2p.datasource;

import com.alibaba.fastjson.JSONObject;
import com.lcsuo.p2p.collect.dao.MongoDBUtils;
import com.lcsuo.p2p.collect.datasource.DataSource;
import com.lcsuo.p2p.collect.datasource.WdzjDataSource;
import com.lcsuo.p2p.collect.entity.P2p;
import com.lcsuo.p2p.collect.entity.WdzjPage;

public class Test {

	public static void main(String[] args) {
		DataSource dataSource = new WdzjDataSource();
		WdzjPage page = dataSource.search("http://www.wdzj.com/front_select-plat");
		for (P2p p2p : page.getList()) {
			System.out.println(p2p.getPlatName());
			MongoDBUtils.insert(JSONObject.toJSONString(p2p));
		}
	}
	
	

}
