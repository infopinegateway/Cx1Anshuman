package com.example.demo.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.demo.bean.Question;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("D:\\config.xml");
		
		  Question q=(Question)context.getBean("q"); 
		  q.displayInfo();
		 
	}

}
