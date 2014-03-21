package com.ezhao.lamps.vo;

import org.springframework.web.multipart.MultipartFile;

public class FileForm {
	private MultipartFile file;
	private MultipartFile file1;
	
	public MultipartFile getFile1() {
		return file1;
	}

	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}

	private String description;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
