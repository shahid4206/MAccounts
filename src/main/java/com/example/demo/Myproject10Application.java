package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Myproject10Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Myproject10Application.class, args);
		
		
		Start b = context.getBean(Start.class);
		b.main(null);
		
		//basic a = context.getBean(basic.class);
		//a.show();
		
		System.out.println("hello");
	}

}
