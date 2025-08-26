package com.vamsi.MyFirst;

import org.springframework.stereotype.Component;

@Component
public class Dell implements Laptop {
	Price p;
	Dell(Price p)
	{
		this.p=p;
	}

	@Override
	public void getBrandAndPrice() {
		System.out.println("Dell");
		p.getDellPrice();
		System.out.println("Vamsi");

	}

}
