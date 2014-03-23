package com.ezhao.lamps.service;

import java.util.List;

import com.ezhao.lamps.entity.Product;

public interface ProductService {

	public List<Product> findProducts(int pageNo, int pageSize, int version);
	
	public List<Product> findProducts(Product product);

	public Product findProduct(Product product);

	public void saveProduct(Product product);

	public void updateProduct(Product product);

	public void deleteProduct(Product product);

}
