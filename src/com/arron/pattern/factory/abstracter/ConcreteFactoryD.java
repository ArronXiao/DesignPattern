package com.arron.pattern.factory.abstracter;

public class ConcreteFactoryD extends AbstractFactory {

    private static final String CLASS_NAME = "ConcreteFactoryD";
    @Override
    public ComplexProduct getComplexProduct() {
        // TODO Auto-generated method stub
        return new ComplexProductA(CLASS_NAME);
    }

    @Override
    public SimpleProduct getSimpleProduct() {
        // TODO Auto-generated method stub
        return new SimpleProductB(CLASS_NAME);
    }

}
