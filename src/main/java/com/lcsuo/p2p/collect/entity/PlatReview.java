package com.lcsuo.p2p.collect.entity;

import java.util.Date;
/**
 * 平台留言
 * 可根据用户回复内容，分析出该平台的口碑排名
 * 已经用户常用词 
 * @author penghaozhong
 *
 */
public class PlatReview {
	/**
	 * 回复id
	 */
	private int reviewId;
	
	/**
	 * 平台id
	 */
	private int platId;
	/**
	 * 用户id
	 */
	private int reviewUserId;
	/**
	 * 用户名
	 */
	private String reviewUserName;
	/**
	 * 回复内容
	 */
	private String reviewContent;
	/**
	 * 回复日期
	 */
	private Date reviewDate;
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getPlatId() {
		return platId;
	}
	public void setPlatId(int platId) {
		this.platId = platId;
	}
	public int getReviewUserId() {
		return reviewUserId;
	}
	public void setReviewUserId(int reviewUserId) {
		this.reviewUserId = reviewUserId;
	}
	public String getReviewUserName() {
		return reviewUserName;
	}
	public void setReviewUserName(String reviewUserName) {
		this.reviewUserName = reviewUserName;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	

}
