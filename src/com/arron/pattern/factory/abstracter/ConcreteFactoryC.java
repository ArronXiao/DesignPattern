package com.arron.pattern.factory.abstracter;

public class ConcreteFactoryC extends AbstractFactory {

    private static final String CLASS_NAME = "ConcreteFactoryC";
    //此时的具体的工厂已经不止可以产生一种产品了
    @Override
    public ComplexProduct getComplexProduct() {
        // TODO Auto-generated method stub
        return new ComplexProductB(CLASS_NAME);
    }

    @Override
    public SimpleProduct getSimpleProduct() {
        // TODO Auto-generated method stub
        return new SimpleProductA(CLASS_NAME);
    }

}
