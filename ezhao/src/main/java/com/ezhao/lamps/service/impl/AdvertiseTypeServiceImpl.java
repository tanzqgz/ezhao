package com.ezhao.lamps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ezhao.lamps.dao.AdvertiseTypeDao;
import com.ezhao.lamps.entity.AdvertiseType;
import com.ezhao.lamps.service.AdvertiseTypeService;

@Service
public class AdvertiseTypeServiceImpl implements AdvertiseTypeService{
	@Resource
	private AdvertiseTypeDao advertiseTypeDao;
	
	@Override
	public List<AdvertiseType> findAll() {
		return advertiseTypeDao.findAll();
	}

	@Override
	public void save(AdvertiseType obj) {
		advertiseTypeDao.save(obj);
	}

	@Override
	public void delete(AdvertiseType obj) {
		advertiseTypeDao.delete(obj);
	}

}
