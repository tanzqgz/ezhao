package com.ezhao.lamps.service;

import java.util.List;

import com.ezhao.lamps.entity.SuccessfulCaseCategory;

public interface SuccessfulCaseCategoryService {
	public List<SuccessfulCaseCategory> findAll();
	
	public void save(SuccessfulCaseCategory obj);
	
	public void delete(SuccessfulCaseCategory obj);
}
