package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
@Autowired
private CustomerRepository repository;
@Autowired
private RestTemplate template;

public void createOrder() {
	  final String uri = "http://localhost:8083/orders";
    String result = template.getForObject(uri, String.class);
    System.out.println(result);
}
}
