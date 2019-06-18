package com.arron.pattern.visitor;

public class BElement implements IElement {

	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("I am BElement");
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitor(this);
	}

}
