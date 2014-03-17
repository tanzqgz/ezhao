package com.ezhao.lamps.service;

import java.util.List;

import com.ezhao.lamps.entity.Category;

public interface CategoryService {

	public List<Category> findCategorys(int version);
}
