package com.qolsys.onlineshopping.dao;

import java.util.List;

import com.qolsys.onlineshopping.dto.Category;
import com.qolsys.onlineshopping.dto.Product;

public interface ProductDao {
	
	
	
	List<Product> list();
	Product get(int productId);
	
	
	
	public boolean add(Product product);
	
	public boolean update(Product product);
	public boolean delete(Product product);
	
	// bussiness methods 
	
	List<Product>  listActiveProducts();
	List<Product>   listActiveProductsBycategory(int categoryId);
	List<Product>    getLatestActiveProducts(int count);
	
}
