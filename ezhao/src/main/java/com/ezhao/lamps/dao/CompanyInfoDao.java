package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.CompanyInfo;

public interface CompanyInfoDao {
	public List<CompanyInfo> findAll();
	
	public void update(CompanyInfo obj);
	
	public void save(CompanyInfo obj);
}
