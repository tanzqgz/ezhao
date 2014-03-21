package com.ezhao.lamps.service;

import java.util.List;

import com.ezhao.lamps.entity.Advertise;

public interface AdvertiseService {
	public List<Advertise> findAll();
	
	public void save(Advertise obj);
	
	public void delete(Advertise obj);
}
