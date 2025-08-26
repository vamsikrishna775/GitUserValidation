package com.vamsi.MyFirst;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(MyFirstApplication.class, args);
	     Laptop l=context.getBean(Dell.class);
	     l.getBrandAndPrice();
	     l=context.getBean(Hp.class);
	     l.getBrandAndPrice();
	}

}
