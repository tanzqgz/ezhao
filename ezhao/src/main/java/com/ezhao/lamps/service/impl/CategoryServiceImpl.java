package com.ezhao.lamps.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ezhao.lamps.dao.CategoryDao;
import com.ezhao.lamps.entity.Category;
import com.ezhao.lamps.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Resource
	private CategoryDao categoryDao;

	@Override
	public List<Category> findCategorys(int version) {
		List<Category> categorys = new ArrayList<Category>();
		if (0 == version) {
			categorys = categoryDao.findCategorysForCN();
		} else {
			categorys = categoryDao.findCategorysForEN();
		}
		return categorys;
	}

}
