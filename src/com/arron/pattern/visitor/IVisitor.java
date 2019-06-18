package com.arron.pattern.visitor;

public interface IVisitor {
	//抽象接口里面要能够访问到所有的具体元素，子类中需要针对不同的元素做不同的响应
	void visitor(AElement aElement);
	void visitor(BElement bElement);
	
	//如果是直接持有，当赋值的时候需要强转或者直接指定的具体的元素，如果有一个accept，则可以完成一次伪动态双分配操作，完成自动的accept visitor
	
	//做一个假设 如果进行方向操作，直接用Visitor通过传参的方式来操作Element会怎么样？  这样会失去了访问者的拓展性，每次进行调整。 都需要需该接口中对该类的操作。
	
	//因为作为常理 业务变的复杂的时候，accept中还是可以做一些操作，因为体现一个比较符合现实情况的操作，作为被访问的元素，应该对外部来的访问者有知情权。
	
	//如果不用到accept 外部需要关心具体的赋值，这是个很糟糕的操作？？ 而且不能遍历操作，每次都需要进行instance 这种反人类的操作
	//数据元素的种类是稳定的，但是数量是变化 ，也就常常说到的数据结构是稳定的，但是数据是易变的，可以提供多个访问者
}
