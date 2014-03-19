package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.SuccessfulCaseDetail;

public interface SuccessfulCaseDetailDao {
	public List<SuccessfulCaseDetail> findAll();
	
	public void delete(SuccessfulCaseDetail obj);
	
	public void save(SuccessfulCaseDetail obj);
	
	public SuccessfulCaseDetail findById(SuccessfulCaseDetail obj);
}
