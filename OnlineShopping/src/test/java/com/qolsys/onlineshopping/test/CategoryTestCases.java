package com.qolsys.onlineshopping.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qolsys.onlineshopping.dao.CategoryDao;
import com.qolsys.onlineshopping.daoImpl.CategoryDaoImpl;
import com.qolsys.onlineshopping.dto.Category;

public class CategoryTestCases {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDao categoryDao;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.qolsys.onlineshopping");
		context.refresh();
		categoryDao = (CategoryDao)context.getBean("categoryDao");

	}

@Test
public void addTestCategory() {
	
	  category= new Category();
	  category.setId(1);
	  category.setName("Television");
	 category.setDescription(" this is television description");
	 category.setImageUrl("tel.png");
	 assertEquals("Successful ", true, categoryDao.add(category));
	
}
}
