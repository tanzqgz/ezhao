package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.Category;

public interface CategoryDao {

	public List<Category> findCategorysForCN();

	public List<Category> findCategorysForEN();
}
