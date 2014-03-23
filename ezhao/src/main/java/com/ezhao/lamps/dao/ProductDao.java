package com.ezhao.lamps.dao;

import java.util.List;

import com.ezhao.lamps.entity.Page;
import com.ezhao.lamps.entity.Product;

public interface ProductDao {

	public List<Product> findProductsByPage(Page page);
	
	public Product findProduct(Product product);

	public void saveProduct(Product product);

	public void updateProduct(Product product);

	public void deleteProduct(Product product);
	
	public List<Product> findAllProducts(Product product);

}
