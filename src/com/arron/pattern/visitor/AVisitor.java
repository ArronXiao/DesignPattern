package com.arron.pattern.visitor;

public class AVisitor implements IVisitor {

	@Override
	public void visitor(AElement aElement) {
		// TODO Auto-generated method stub
		aElement.doSomeThing();
	}

	@Override
	public void visitor(BElement bElement) {
		// TODO Auto-generated method stub
		bElement.doSomeThing();
	}


}
