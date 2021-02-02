package com.example.demo.Entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private Date dateCreated;

    private String status;

	public Long getId() {
		return id;
	}

	




	public Date getDateCreated() {
		return dateCreated;
	}






	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}






	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    

}
