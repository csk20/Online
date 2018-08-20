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

/*@Test
public void addTestCategory() {
	
	  category= new Category();
	  category.setId(1);
	  category.setName("Television");
	 category.setDescription(" this is television description");
	 category.setImageUrl("tel.png");
	 assertEquals("Successful ", true, categoryDao.add(category));
	
}*/



/*@Test
public void getTestCategory() {
	
	category= categoryDao.get(1);
	assertEquals("Successful fetch ", "Television", category.getName());
}
}*/

/*
@Test
public void updateTestCategory() {
	
	category= categoryDao.get(1);
	category.setName("Mobile");
	assertEquals("Successful update ", true, categoryDao.update(category));
}
*/


/*@Test
public void deleteTestCategory() {
	
	category= categoryDao.get(1);
	category.setName("Mobile");
	assertEquals("Successful delete ", true, categoryDao.delete(category));
}*/
	

/*@Test
public void listTestCategory() {
	
	
	assertEquals("Successful list", 1,categoryDao.list().size());
}
	*/
	
	@Test
	public void curdTestCategory() {
		//add
		 category= new Category();
		 
		  category.setName("Television");
		 category.setDescription(" this is television description");
		 category.setImageUrl("tel.png");
		 assertEquals("Successful add ", true, categoryDao.add(category));
		
		 category= new Category();
		 
		  category.setName("Computer");
		 category.setDescription(" this is television description");
		 category.setImageUrl("computer.png");
		 assertEquals("Successful  add", true, categoryDao.add(category));
		 
		 
		 
		// update category
		 category= categoryDao.get(4);
			category.setName("Mobile");
			assertEquals("Successful update ", true, categoryDao.update(category));
			
			
			// update category
			category= categoryDao.get(5);
			category.setName("Television");
			assertEquals("Successful update ", true, categoryDao.update(category));
			
			
			//fetch the list size
			assertEquals("Successful list", 4,categoryDao.list().size());
			
			
			// delete category
			assertEquals("Successful delete ", true, categoryDao.delete(category));
			
	}
	
}
