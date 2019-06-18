package com.arron.pattern.visitor;


public class ObjectStruct {

	
	IElement aElement = new AElement();
	
	
	public void accept(IVisitor visitor) {
		aElement.accept(visitor);
	}
	
	
	
}
