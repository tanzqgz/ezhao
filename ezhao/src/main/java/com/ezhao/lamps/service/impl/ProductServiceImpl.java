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
		if (0 == version) {
			products = productDao.findProductsForCN(page);
		} else {
			products = productDao.findProductsForEN(page);
		}
		return products;
	}

}
