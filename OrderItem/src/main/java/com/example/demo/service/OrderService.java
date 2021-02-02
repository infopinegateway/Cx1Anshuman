package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Order;
import com.example.demo.repository.OrderRepository;
@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public Order create(Order order) {
        return this.repository.save(order);
    }
	 public void update(Order order) {
	        this.repository.save(order);
	    }
	 
	 public List<Order> getAllOrders() {
		 List<Order> orders=new ArrayList<Order>();
		 repository.findAll().forEach(orders1->orders.add(orders1));
		 return orders;
}
}