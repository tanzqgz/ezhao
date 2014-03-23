package com.ezhao.lamps.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ezhao.lamps.dao.ProductDao;
import com.ezhao.lamps.entity.Page;
import com.ezhao.lamps.entity.Product;
import com.ezhao.lamps.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductDao productDao;

	@Override
	public List<Product> findProducts(int pageNo, int pageSize, int version) {
		List<Product> products = new ArrayList<Product>();
		int offset = (pageNo - 1) * pageSize;
		Page page = new Page(offset, pageSize);
		products = productDao.findProductsByPage(page);

		return products;
	}

	@Override
	public void saveProduct(Product product) {
		productDao.saveProduct(product);

	}

	@Override
	public void updateProduct(Product product) {
		productDao.updateProduct(product);
	}

	@Override
	public void deleteProduct(Product product) {
		productDao.deleteProduct(product);

	}

	@Override
	public Product findProduct(Product product) {
		Product retobj = productDao.findProduct(product);
		return retobj;
	}

	@Override
	public List<Product> findProducts(Product product) {
		List<Product> products = productDao.findAllProducts(product);
		return products;
	}

}
