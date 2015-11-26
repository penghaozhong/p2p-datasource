package com.lcsuo.p2p.collect.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 评论
 * @author penghaozhong
 *
 */
@Document(collection = "comment")
public class Comment {
	
	@Id
	private String id;
	
	private String p2pId;
	
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getP2pId() {
		return p2pId;
	}

	public void setP2pId(String p2pId) {
		this.p2pId = p2pId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
