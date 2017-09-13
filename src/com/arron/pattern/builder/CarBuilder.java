package com.arron.pattern.builder;


//这里的抽象的建造者　是用来车的建造者

//这里就产生了一个思考，为啥车要用一个建造者呢？？
//车是一个集合体，会有很多部件，在真实的构造过程中也会有非常复杂，其创造流程应该所有序的，为了避免创建一个车的对象时
//传递一大堆的参数，以及new 一堆新的对象，这里就有了建造者

//为了反应车的构造过程，在这里处理车的构造时，加上轮子，引擎的对象
public interface CarBuilder {
    String getName();
    CarShoe getCarShoe();
    CarEngineer getCarCarEngineer();
}
