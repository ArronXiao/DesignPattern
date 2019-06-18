package com.arron.pattern.visitor;

public class AElement implements IElement {

	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("I am AElement");
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		//如果复杂的业务中应该可以做一些额外的操作来控制和限制访问者？？？
		visitor.visitor(this);
	}

}
