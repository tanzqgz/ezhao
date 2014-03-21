package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.AdvertiseType;

public interface AdvertiseTypeDao {
	public List<AdvertiseType> findAll();
	
	public void save(AdvertiseType obj);

	public void delete(AdvertiseType obj);
}
