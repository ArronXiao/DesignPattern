package com.arron.pattern.visitor;

public interface IElement {

	void doSomeThing();
	
	void accept(IVisitor visitor);

}
