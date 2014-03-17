package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.Page;
import com.ezhao.lamps.entity.Product;

public interface ProductDao {

	public List<Product> findProductsForCN(Page page);

	public List<Product> findProductsForEN(Page page);
	
}
