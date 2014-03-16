package com.ezhao.lamps.service;

import com.ezhao.lamps.entity.CompanyInfo;

public interface CompanyInfoService {
	public CompanyInfo findCompanyInfo();
	
	public void save(CompanyInfo obj);
	
	public void update(CompanyInfo obj);
}
