package com.ezhao.lamps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ezhao.lamps.dao.SuccessfulCaseCategoryDao;
import com.ezhao.lamps.entity.SuccessfulCaseCategory;
import com.ezhao.lamps.service.SuccessfulCaseCategoryService;

@Service
public class SuccessfulCaseCategoryServiceImpl implements SuccessfulCaseCategoryService{
	@Resource
	private SuccessfulCaseCategoryDao successfulCaseCategoryDao;
	
	public List<SuccessfulCaseCategory> findAll(){
		return successfulCaseCategoryDao.findAll();
	}
	
	public void save(SuccessfulCaseCategory obj){
		successfulCaseCategoryDao.save(obj);
		if(obj.getId() != 0){
			obj.setIsLeaf("N");
			successfulCaseCategoryDao.update(obj);
		}
	}
	
	@Override
	public void delete(SuccessfulCaseCategory obj) {
		successfulCaseCategoryDao.delete(obj);
	}
}
