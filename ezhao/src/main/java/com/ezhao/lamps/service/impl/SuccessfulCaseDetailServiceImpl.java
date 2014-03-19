package com.ezhao.lamps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ezhao.lamps.dao.SuccessfulCaseDetailDao;
import com.ezhao.lamps.entity.SuccessfulCaseDetail;
import com.ezhao.lamps.service.SuccessfulCaseDetailService;

@Service
public class SuccessfulCaseDetailServiceImpl implements SuccessfulCaseDetailService{
	@Resource
	private SuccessfulCaseDetailDao successfulCaseDetailDao;
	@Override
	public List<SuccessfulCaseDetail> findAll() {
		return successfulCaseDetailDao.findAll();
	}

	@Override
	public void save(SuccessfulCaseDetail obj) {
		successfulCaseDetailDao.save(obj);
	}

	@Override
	public void delete(SuccessfulCaseDetail obj) {
		successfulCaseDetailDao.delete(obj);
	}

	@Override
	public SuccessfulCaseDetail findById(SuccessfulCaseDetail obj) {
		return successfulCaseDetailDao.findById(obj);
	}
}
