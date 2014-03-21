package com.ezhao.lamps.entity;

public class Advertise {
	private int id;
	private String advertiseURL;
	private String advertiseLink;
	private int typeId;
	private String description;
	private String advertiseURLEN;
	private String advertiseLinkEN;
	private String descriptionEN;
	
	public String getDescriptionEN() {
		return descriptionEN;
	}

	public void setDescriptionEN(String descriptionEN) {
		this.descriptionEN = descriptionEN;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdvertiseURLEN() {
		return advertiseURLEN;
	}

	public void setAdvertiseURLEN(String advertiseURLEN) {
		this.advertiseURLEN = advertiseURLEN;
	}

	public String getAdvertiseLinkEN() {
		return advertiseLinkEN;
	}

	public void setAdvertiseLinkEN(String advertiseLinkEN) {
		this.advertiseLinkEN = advertiseLinkEN;
	}

	public String getAdvertiseLink() {
		return advertiseLink;
	}

	public void setAdvertiseLink(String advertiseLink) {
		this.advertiseLink = advertiseLink;
	}

	public void setAdvertiseURL(String advertiseURL) {
		this.advertiseURL = advertiseURL;
	}
	
	public String getAdvertiseURL() {
		return advertiseURL;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
