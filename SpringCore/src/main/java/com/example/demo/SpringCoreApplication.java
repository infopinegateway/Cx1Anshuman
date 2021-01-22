package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	
	
ApplicationContext context = new FileSystemXmlApplicationContext("D:/myconfig.xml");

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
		ApplicationContext context = new FileSystemXmlApplicationContext("D:/myconfig.xml");

	}

}
