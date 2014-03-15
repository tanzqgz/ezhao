package com.ezhao.lamps.entity;

import java.util.Date;

public class Category {

	public int id;
	public String categoryName;
	public int categoryParent;
	public Date createDate;

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
