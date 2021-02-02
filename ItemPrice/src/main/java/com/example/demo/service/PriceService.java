package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Price;
import com.example.demo.repository.PriceRepository;

@Service
public class PriceService {
	@Autowired
	private PriceRepository repository;
	
	public List<Price> getAllPrice()   
	{  
	List<Price> price = new ArrayList<Price>();  
	repository.findAll().forEach(price1 -> price.add(price1));  
	return price;  
	}
	
	//saving a specific record by using the method save() of CrudRepository  
		public void saveOrUpdate(Price price)   
		{  
		repository.save(price);  
		}
}
