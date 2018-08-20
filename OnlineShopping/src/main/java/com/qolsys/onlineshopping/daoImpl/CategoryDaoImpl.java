package com.qolsys.onlineshopping.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qolsys.onlineshopping.dao.CategoryDao;
import com.qolsys.onlineshopping.dto.Category;

@Repository("categoryDao")
@Transactional
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
		
		
		Category	 category1= new Category();
		  category1.setId(2);
		  category1.setName("Mobile");
		 category1.setDescription(" this is television description");
		 category1.setImageUrl("mob.png");
		categories.add(category1);
	}

	@Override
	public List<Category> list() {
   String selectactiveCategory="from Category where active = :active";
   
   Query query=sessionfactory.getCurrentSession().createQuery(selectactiveCategory);
		
query.setParameter("active",true);


return query.list();

	}

	
	@Override
	
	public boolean add(Category category) {
		try{
			sessionfactory.getCurrentSession().save(category);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}

/*
 * get single category
 * */
	@Override
	public Category get(int id) {
		
		return sessionfactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}


	@Override
	public boolean update(Category category) {
		try{
			sessionfactory.getCurrentSession().update(category);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}


	@Override
	public boolean delete(Category category) {
		
		category.setActive(false);
		try{
			sessionfactory.getCurrentSession().update(category);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	

}
