package com.lcsuo.p2p.collect.datasource;

import com.lcsuo.p2p.collect.entity.WdzjPage;

public interface DataSource {
	
	/**
	 * 查询结果
	 * @param url 查询的网站地址
	 * @return
	 */
	public WdzjPage search(String url);
	
	
	

}
