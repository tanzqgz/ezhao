package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.SuccessfulCaseCategory;

public interface SuccessfulCaseCategoryDao {
	public List<SuccessfulCaseCategory> findAll();
	
	public void save(SuccessfulCaseCategory obj);
	
	public void delete(SuccessfulCaseCategory obj);
	
	public SuccessfulCaseCategory findById(String id);
	
	public void update(SuccessfulCaseCategory obj);
}
