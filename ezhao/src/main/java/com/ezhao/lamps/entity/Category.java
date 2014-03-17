package com.ezhao.lamps.entity;

import java.util.Date;

public class Category {

	private int id;
	private String categoryName;
	private int categoryParent;
	private Date createDate;
	private int version;
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryParent() {
		return categoryParent;
	}

	public void setCategoryParent(int categoryParent) {
		this.categoryParent = categoryParent;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
