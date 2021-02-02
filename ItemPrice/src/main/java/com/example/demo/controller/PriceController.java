package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Price;
import com.example.demo.service.PriceService;
@RestController
public class PriceController {
	@Autowired
	private PriceService service;
	//creating post mapping that post the Items detail in the database  
			@PostMapping("/price")  
			private int savePrice(@RequestBody Price price)   
			{  
			service.saveOrUpdate(price);  
			return price.getId(); 
			}  
			
		//creating a get mapping that retrieves all the items detail from the database
		
		@GetMapping("/allPrice")  
		private List<Price> getAllPrice()   
		{  
		return service.getAllPrice();  
		}  
		
}
