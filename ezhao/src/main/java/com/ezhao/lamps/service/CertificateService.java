package com.ezhao.lamps.service;

import java.util.List;

import com.ezhao.lamps.entity.Certificate;

public interface CertificateService {
	public void save(Certificate obj);
	
	public void delete(Certificate obj);
	
	public List<Certificate> findAll();
}
