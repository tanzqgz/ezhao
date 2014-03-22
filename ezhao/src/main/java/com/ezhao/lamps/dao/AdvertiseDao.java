package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.Advertise;

public interface AdvertiseDao {
	public List<Advertise> findAll();
	
	public void save(Advertise obj);
	
	public void delete(Advertise obj);
	
	public List<Advertise> findByTypeId(Advertise obj);
}
