package com.ezhao.lamps.entity;

public class Page {

	private int offset;
	private int pageSize;

	public Page() {

	}

	public Page(int offset, int pageSize) {
		this.offset = offset;
		this.pageSize = pageSize;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
