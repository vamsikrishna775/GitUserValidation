package com.vamsi.MyFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hp implements Laptop {
    Price p;
    @Autowired
    public void setPrice(Price p)
    {
    	this.p=p;
    }
	@Override
	public void getBrandAndPrice() {
		System.out.println("Hp");
		p.getHpPrice();
	}

}
