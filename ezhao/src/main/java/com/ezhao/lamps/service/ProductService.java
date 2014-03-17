package com.ezhao.lamps.service;

import java.util.List;

import com.ezhao.lamps.entity.Product;

public interface ProductService {

	public List<Product> findProducts(int pageNo, int pageSize, int version);

}
