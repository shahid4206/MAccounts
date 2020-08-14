package com.example.demo;

import org.springframework.stereotype.Component;

@Component
//@Prototype
public class basic {
	private int number;
	private String name;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("heyyy");
	}
	
	

}
