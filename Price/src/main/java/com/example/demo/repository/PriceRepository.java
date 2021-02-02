package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Price;

public interface PriceRepository extends CrudRepository<Price, Integer>{

}
