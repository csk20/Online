package com.qolsys.onlineshopping.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qolsys.onlineshopping.dao.ProductDao;
import com.qolsys.onlineshopping.dto.Category;
import com.qolsys.onlineshopping.dto.Product;

public class ProductTestCases {

	private static AnnotationConfigApplicationContext context;
	private static ProductDao productDao;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.qolsys.onlineshopping");
		context.refresh();
		productDao = (ProductDao)context.getBean("productDao");

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
	/*	Product	product= new Product();
		product.setActive(true);
		product.setBrand("apple");
		product.setCategoryId(1);
		product.setCode("PROuhgh");
		product.setDescription("Test apple");
		product.setName("iphone 5");
		product.setSupplierId(34);
		product.setUnitPrice(67676);
		product.setViews(23);
		 assertEquals("Successful add ", true, productDao.add(product));
		
			product= new Product();
			product.setActive(true);
			product.setBrand("sony");
			product.setCategoryId(2);
			product.setCode("PROuhgh");
			product.setDescription("Test tel");
			product.setName("tel 5");
			product.setSupplierId(33);
			product.setUnitPrice(67876);
			product.setViews(27);
			 assertEquals("Successful add ", true, productDao.add(product));
			
		 */
		 
		// update category
		Product	 product= productDao.get(1);
			 product.setName(" Mobile");
			assertEquals("Successful update ", true, productDao.update(product));
			
			
	
			
			//fetch the list size
			assertEquals("Successful list", 2,productDao.list().size());
			
			
			// delete category
			assertEquals("Successful delete ", true, productDao.delete(product));
			
	}
	
}
