package com.arron.pattern.factory.normal;

public class FactoryA implements Factory {

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return new ProductA();
	}	 
	
}
