package com.arron.pattern.factory.simple;

public class SimpleFactory {
 
	 
	 public static Product getProduct(String type) {
		 Product product = null;
		 switch (type) {
			case "A":
				product = new ProductA();
				break;
			case "B":
				product = new ProductB();
				break;
		default:
			break;
		}
		 return product;
	}
	
}
