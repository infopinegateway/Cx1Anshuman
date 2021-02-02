package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Order;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/orders")
	public Long create(@RequestBody Order order) {
		service.create(order);
		return order.getId();
	}
		
	@PutMapping("/books")  
	private Order update(@RequestBody Order orders)   
	{  
	service.update(orders); 
	return orders;  
	}  
	
	@GetMapping("/getOrder")  
	private List<Order> getAllOrders()   
	{  
	return service.getAllOrders();
	}  

}
