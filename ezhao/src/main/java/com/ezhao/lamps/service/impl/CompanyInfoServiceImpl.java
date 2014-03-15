package com.ezhao.lamps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ezhao.lamps.dao.CompanyInfoDao;
import com.ezhao.lamps.entity.CompanyInfo;
import com.ezhao.lamps.service.CompanyInfoService;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService{
	@Resource
	private CompanyInfoDao companyInfoDao;
	
	@Override
	public CompanyInfo findCompanyInfo() {
		List<CompanyInfo> list = companyInfoDao.findAll();
		CompanyInfo obj = list.size() == 0 ? new CompanyInfo() : list.get(0);
		return obj;
	}

}
