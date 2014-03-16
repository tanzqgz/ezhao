package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.Certificate;

public interface CertificateDao {
	public void save(Certificate obj);
	
	public void delete(Certificate obj);
	
	public List<Certificate> findAll();
}
