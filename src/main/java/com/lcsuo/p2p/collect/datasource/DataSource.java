package com.lcsuo.p2p.collect.datasource;

import java.util.List;

import com.lcsuo.p2p.collect.entity.P2p;

public interface DataSource {
	
	/**
	 * 查询结果
	 * @param url 查询的网站地址
	 * @return
	 */
	public List<P2p> search(String url);
	
	
	

}
