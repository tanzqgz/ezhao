package com.ezhao.lamps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ezhao.lamps.dao.CertificateDao;
import com.ezhao.lamps.entity.Certificate;
import com.ezhao.lamps.service.CertificateService;

@Service
public class CertificateServiceImpl implements CertificateService{
	@Resource
	private CertificateDao dao;
	
	@Override
	public void save(Certificate obj) {
		dao.save(obj);
	}

	@Override
	public void delete(Certificate obj) {
		dao.delete(obj);
	}

	@Override
	public List<Certificate> findAll() {
		return dao.findAll();
	}

}
