package com.qolsys.onlineshopping.dao;

import java.util.List;

import com.qolsys.onlineshopping.dto.Category;

public interface CategoryDao {
	
	List<Category> list();
	public boolean add(Category category);
	Category get(int id);

}
