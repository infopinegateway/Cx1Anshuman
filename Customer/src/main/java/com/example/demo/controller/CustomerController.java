package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@PostMapping("/create")
	public String createOrder() {
		service.createOrder();
		return "order created successfully";
	}
	@GetMapping("/getOrders")
	public Order  getOrders() {
		ResponseEntity<Order> responseEntity=new RestTemplate().getForEntity("http://localhost:8083/getOrder", Order.class);
		Order response=responseEntity.getBody();  
		return new Order(response.getId(),response.getDateCreated(),response.getStatus());
	}
	

}
