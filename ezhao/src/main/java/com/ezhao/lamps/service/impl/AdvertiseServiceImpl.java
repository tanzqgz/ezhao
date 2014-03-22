package com.ezhao.lamps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ezhao.lamps.dao.AdvertiseDao;
import com.ezhao.lamps.entity.Advertise;
import com.ezhao.lamps.service.AdvertiseService;

@Service
public class AdvertiseServiceImpl implements AdvertiseService{
	@Resource
	private AdvertiseDao advertiseDao;
	
	@Override
	public List<Advertise> findAll() {
		return advertiseDao.findAll();
	}

	@Override
	public void save(Advertise obj) {
		advertiseDao.save(obj);
	}

	@Override
	public void delete(Advertise obj) {
		advertiseDao.delete(obj);
	}

	@Override
	public List<Advertise> findByTypeId(Advertise obj) {
		return advertiseDao.findByTypeId(obj);
	}

}
