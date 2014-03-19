package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.Category;

public interface CategoryDao {

	public List<Category> findCategorysForCN();

	public List<Category> findCategorysForEN();
	
	public List<Category> findAll();
	
	public void save(Category obj);
	
	public void delete(Category obj);
}
