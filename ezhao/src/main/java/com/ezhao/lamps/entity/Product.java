package com.ezhao.lamps.entity;

import java.util.Date;

public class Product {

	private int id;
	private String productNameCN;
	private String productNameEN;
	private String descriptionCN;
	private String descriptionEN;
	private int productCategory;
	private String thumbnails;
	private Date createDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductNameCN() {
		return productNameCN;
	}
	public void setProductNameCN(String productNameCN) {
		this.productNameCN = productNameCN;
	}
	public String getProductNameEN() {
		return productNameEN;
	}
	public void setProductNameEN(String productNameEN) {
		this.productNameEN = productNameEN;
	}
	public String getDescriptionCN() {
		return descriptionCN;
	}
	public void setDescriptionCN(String descriptionCN) {
		this.descriptionCN = descriptionCN;
	}
	public String getDescriptionEN() {
		return descriptionEN;
	}
	public void setDescriptionEN(String descriptionEN) {
		this.descriptionEN = descriptionEN;
	}
	public int getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}
	public String getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	

	
}
