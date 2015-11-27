package com.lcsuo.p2p.collect.entity;

import java.util.List;

/**
 * page 对象
 * @author penghaozhong
 *
 */
public class WdzjPage {
	
	/**
	 * 排名月份
	 */
	private String rankingMonth;
	/**
	 * 总数
	 */
	private int rowCount;
	/**
	 * 总页数
	 */
	private int pageCount;
	
	/**
	 * p2p 列表
	 */
	private List<P2p> list;
	

	public WdzjPage(String rankingMonth, int rowCount, int pageCount) {
		super();
		this.rankingMonth = rankingMonth;
		this.rowCount = rowCount;
		this.pageCount = pageCount;
	}

	public String getRankingMonth() {
		return rankingMonth;
	}

	public void setRankingMonth(String rankingMonth) {
		this.rankingMonth = rankingMonth;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<P2p> getList() {
		return list;
	}

	public void setList(List<P2p> list) {
		this.list = list;
	}
	

}
