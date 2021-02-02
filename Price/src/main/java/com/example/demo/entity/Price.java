package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class Price {
	private Integer id;
	private Integer itemPrice;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}
	

}
