package com.ezhao.lamps.service;

import java.util.List;

import com.ezhao.lamps.entity.SuccessfulCaseDetail;

public interface SuccessfulCaseDetailService {
	public List<SuccessfulCaseDetail> findAll();
	
	public void save(SuccessfulCaseDetail obj);
	
	public void delete(SuccessfulCaseDetail obj);
	
	public SuccessfulCaseDetail findById(SuccessfulCaseDetail obj);
}
