package com.lcsuo.p2p.collect.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * p2p机构
 * @author jacky
 *
 */
@Document(collection = "p2p")
public class P2p {
	
	@Id
	private String id;
	/**
	 * 平台简介
	 */
	private String description;
	/**
	 * 企业名称
	 */
	private String enterpriseName;
	/**
	 *  企业法人
	 */
	private String enterprisePerson;
	
	
	/**
	 * 平台id
	 * "91"
	 */
	private String platId;
	
	/**
	 * "团贷网"
	 */
	private String platName;
	
	/**
	 * "tdw"
	 */
	private String platPin;
	
	/**
	 * "tuandaiwang"
	 */
	private String allPlatNamePin;
	
	/**
	 * "http://www.tuandai.com"
	 */
	private String platUrl;
	
	/**
	 * 44
	 */
	private String locationArea;
	
	/**
	 * "广东"
	 */
	private String locationAreaName;
	
	/**
	 * 4419
	 */
	private String locationCity;
	
	/**
	 * "东莞"
	 */
	private String locationCityName;
	
	/**
	 * 经纬度
	 */
	private String location;
	
	/**
	 * 上线时间
	 * "2012-07-15"
	 */
	private String onlineDate;
	
	/**
	 * http://www.wdzj.com/wdzj/images/example/20140526123958.jpg
	 */
	private String platLogoUrl;
	/**
	 * http://www.wdzj.com/wdzj/images/plat/icon/85.jpg
	 */
	private String platIconUrl;
	
	private String platEarnings;
	
	/**
	 * 平均收益
	 * 12.67
	 */
	private String platStar;
	
	/**
	 * 5
	 */
	private String withTzj;
	
	/**
	 * false
	 */
	private String tzjPj;
	
	/**
	 * ""
	 */
	private String registeredCapital;
	
	/**
	 * 注册资本
	 * 12256
	 */
	private String withdrawSpeed;
	
	/**
	 * 提现
	 * 2.7
	 */
	private String serviceAttitude;
	
	/**
	 * 站岗
	 * 3.7
	 */
	private String salaryguard;
	
	/**
	 * 服务
	 * 3.7
	 */
	private String webexper;
	
	/**
	 * 体验
	 * 3.6
	 */
	private String termWeight;
	
	/**
	 * 375.79999999999995
	 */
	private String term;
	
	/**
	 * 投资期限
	 * "1月标(61.8%)、6月以上标(32.9%)等"
	 */
	private String zonghezhishu;
	
	/**
	 * 综合指数
	 * 48.75
	 */
	private String zonghezhishuRanking;
	
	/**
	 * 平台状态
	 * 
	 * 3:体现困难
	 * 5：跑路
	 */
	private String platStatus;
	
	/**
	 * 1
	 */
	private String securityModel;
	
	/**
	 * "01,02"
	 */
	private String securityModelOther;
	
	/**
	 * 保障模式
	 * "担保公司"
	 */
	private String riskReserve;
	
	/**
	 * 风险准备金
	 * 3000
	 */
	private String autoBid;
	
	/**
	 * "1"
	 */
	private String newTrustCreditor;
	
	
	private List<PlatReview> platReviewList;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEnterprisePerson() {
		return enterprisePerson;
	}

	public void setEnterprisePerson(String enterprisePerson) {
		this.enterprisePerson = enterprisePerson;
	}

	public String getPlatId() {
		return platId;
	}

	public void setPlatId(String platId) {
		this.platId = platId;
	}

	public String getPlatName() {
		return platName;
	}

	public void setPlatName(String platName) {
		this.platName = platName;
	}

	public String getPlatPin() {
		return platPin;
	}

	public void setPlatPin(String platPin) {
		this.platPin = platPin;
	}

	public String getAllPlatNamePin() {
		return allPlatNamePin;
	}

	public void setAllPlatNamePin(String allPlatNamePin) {
		this.allPlatNamePin = allPlatNamePin;
	}

	public String getPlatUrl() {
		return platUrl;
	}

	public void setPlatUrl(String platUrl) {
		this.platUrl = platUrl;
	}

	public String getLocationArea() {
		return locationArea;
	}

	public void setLocationArea(String locationArea) {
		this.locationArea = locationArea;
	}

	public String getLocationAreaName() {
		return locationAreaName;
	}

	public void setLocationAreaName(String locationAreaName) {
		this.locationAreaName = locationAreaName;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getLocationCityName() {
		return locationCityName;
	}

	public void setLocationCityName(String locationCityName) {
		this.locationCityName = locationCityName;
	}

	public String getOnlineDate() {
		return onlineDate;
	}

	public void setOnlineDate(String onlineDate) {
		this.onlineDate = onlineDate;
	}

	public String getPlatLogoUrl() {
		return platLogoUrl;
	}

	public void setPlatLogoUrl(String platLogoUrl) {
		this.platLogoUrl = platLogoUrl;
	}

	public String getPlatIconUrl() {
		return platIconUrl;
	}

	public void setPlatIconUrl(String platIconUrl) {
		this.platIconUrl = platIconUrl;
	}

	public String getPlatEarnings() {
		return platEarnings;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPlatEarnings(String platEarnings) {
		this.platEarnings = platEarnings;
	}

	public String getPlatStar() {
		return platStar;
	}

	public void setPlatStar(String platStar) {
		this.platStar = platStar;
	}

	public String getWithTzj() {
		return withTzj;
	}

	public void setWithTzj(String withTzj) {
		this.withTzj = withTzj;
	}

	public String getTzjPj() {
		return tzjPj;
	}

	public void setTzjPj(String tzjPj) {
		this.tzjPj = tzjPj;
	}

	public String getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public String getWithdrawSpeed() {
		return withdrawSpeed;
	}

	public void setWithdrawSpeed(String withdrawSpeed) {
		this.withdrawSpeed = withdrawSpeed;
	}

	public String getServiceAttitude() {
		return serviceAttitude;
	}

	public void setServiceAttitude(String serviceAttitude) {
		this.serviceAttitude = serviceAttitude;
	}

	public String getSalaryguard() {
		return salaryguard;
	}

	public void setSalaryguard(String salaryguard) {
		this.salaryguard = salaryguard;
	}

	public String getWebexper() {
		return webexper;
	}

	public void setWebexper(String webexper) {
		this.webexper = webexper;
	}

	public String getTermWeight() {
		return termWeight;
	}

	public void setTermWeight(String termWeight) {
		this.termWeight = termWeight;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getZonghezhishu() {
		return zonghezhishu;
	}

	public void setZonghezhishu(String zonghezhishu) {
		this.zonghezhishu = zonghezhishu;
	}

	public String getZonghezhishuRanking() {
		return zonghezhishuRanking;
	}

	public void setZonghezhishuRanking(String zonghezhishuRanking) {
		this.zonghezhishuRanking = zonghezhishuRanking;
	}

	public String getPlatStatus() {
		return platStatus;
	}

	public void setPlatStatus(String platStatus) {
		this.platStatus = platStatus;
	}

	public String getSecurityModel() {
		return securityModel;
	}

	public void setSecurityModel(String securityModel) {
		this.securityModel = securityModel;
	}

	public String getSecurityModelOther() {
		return securityModelOther;
	}

	public void setSecurityModelOther(String securityModelOther) {
		this.securityModelOther = securityModelOther;
	}

	public String getRiskReserve() {
		return riskReserve;
	}

	public void setRiskReserve(String riskReserve) {
		this.riskReserve = riskReserve;
	}

	public String getAutoBid() {
		return autoBid;
	}

	public void setAutoBid(String autoBid) {
		this.autoBid = autoBid;
	}

	public String getNewTrustCreditor() {
		return newTrustCreditor;
	}

	public void setNewTrustCreditor(String newTrustCreditor) {
		this.newTrustCreditor = newTrustCreditor;
	}

	public List<PlatReview> getPlatReviewList() {
		return platReviewList;
	}

	public void setPlatReviewList(List<PlatReview> platReviewList) {
		this.platReviewList = platReviewList;
	}
	
	

}
