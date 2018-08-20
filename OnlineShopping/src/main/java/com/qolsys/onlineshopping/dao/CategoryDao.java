package com.qolsys.onlineshopping.dao;

import java.util.List;

import com.qolsys.onlineshopping.dto.Category;

public interface CategoryDao {
	
	
	public boolean add(Category category);
	List<Category> list();
	Category get(int id);
  
	public boolean update(Category category);
	public boolean delete(Category category);
	
	
}
