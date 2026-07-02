package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dummy{
	@Autowired
	Laptop obj;
	public void show() {
		System.out.println("This is dymmy class");
		obj.display();
		
		}
}