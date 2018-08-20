package com.qolsys.onlineshopping.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qolsys.onlineshopping.dao.CategoryDao;
import com.qolsys.onlineshopping.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	 private CategoryDao  categoryDao ;
	
	@RequestMapping(value= {"/","/home","/index"})
	public String    index(Map<String,Object> map) {
		map.put("title","Home");
		map.put("userClickHome","true");
		map.put("categeries", categoryDao.list());
		return "page";
	}

	
	@RequestMapping(value= "/about")
	public String    about(Map<String,Object> map) {
		map.put("title","About");
		map.put("userClickAbout","true");
		return "page";
	}

	@RequestMapping(value= {"show/all/products"})
	public String    showAllProducts(Map<String,Object> map) {
		map.put("title","All Products");
		map.put("userClickHome","true");
		map.put("categeries", categoryDao.list());
		return "page";
	}
	
	
	@RequestMapping(value= {"show/categries/{id}/products"})
	public String    showCategoryProducts(Map<String,Object> map,@PathVariable("id") int id) {
	
		map.put("userClickHome","true");
		Category category=null;
		
		category=categoryDao.get(id);
		map.put("title",category.getName());
		map.put("category",category);
		map.put("categeries", categoryDao.list());
		return "page";
	}
	
	@RequestMapping(value= "/contact")
	public String    contact(Map<String,Object> map) {
		map.put("title","Contact");
		map.put("userClickContact","true");
		return "page";
	}
	
	@RequestMapping(value= "/test")
	public String    index(Map<String,Object> map,@RequestParam("greeting") String greeting) {
		if(greeting== null)
			greeting="Welcome to Spring mvc Online shopping";
		
		map.put("greeting","Welcome to spring MVC @ request Param"+ greeting);
		
		return "page";
	}

	
	@RequestMapping(value= "/test1/{greeting}")
	public String    index1(Map<String,Object> map,@PathVariable("greeting") String greeting) {
		if(greeting== null)
			greeting="Welcome to Spring mvc Online shopping";
		
		map.put("greeting","Welcome to spring MVC @PathVariable "+ greeting);
		
		return "page";
	}
	
}
