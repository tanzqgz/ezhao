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
	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	@Override
	public void save(Category obj) {
		categoryDao.save(obj);
	}

	@Override
	public void delete(Category obj) {
		categoryDao.delete(obj);
	}

}
