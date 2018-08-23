package com.qolsys.onlineshopping.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qolsys.onlineshopping.dao.CategoryDao;
import com.qolsys.onlineshopping.dao.ProductDao;
import com.qolsys.onlineshopping.dto.Category;
import com.qolsys.onlineshopping.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired
	 private ProductDao  productDao ;
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts(){
		return productDao.listActiveProducts();
	}
	
	@RequestMapping("/category/{id} /products")
	@ResponseBody
	public List<Product> getProductByCategory(@PathVariable int id){
		return productDao.listActiveProductsBycategory(id);
	}
	
}
 