package com.ezhao.lamps.service;

import java.util.List;

import com.ezhao.lamps.entity.AdvertiseType;

public interface AdvertiseTypeService {
public List<AdvertiseType> findAll();
	
	public void save(AdvertiseType obj);
	
	public void delete(AdvertiseType obj);
}
