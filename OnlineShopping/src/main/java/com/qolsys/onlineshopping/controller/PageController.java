package com.qolsys.onlineshopping.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public String    index(Map<String,Object> map) {
		map.put("title","Home");
		map.put("userClickHome","true");
		return "page";
	}

	
	@RequestMapping(value= "/about")
	public String    about(Map<String,Object> map) {
		map.put("title","About");
		map.put("userClickAbout","true");
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
