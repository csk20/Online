package com.qolsys.onlineshopping.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qolsys.onlineshopping.dao.CategoryDao;
import com.qolsys.onlineshopping.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	private static List<Category>   categories=new ArrayList<>();

	static {
	Category	 category= new Category();
		  category.setId(1);
		  category.setName("Television");
		 category.setDescription(" this is television description");
		 category.setImageUrl("tel.png");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	
	@Override
	@Transactional
	public boolean add(Category category) {
		try{
			sessionfactory.getCurrentSession().save(category);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}


	@Override
	public Category get(int id) {
		for(Category c: categories) {
			if(c.getId()==id) return c;
		}
		return null;
	}

	
	

}
