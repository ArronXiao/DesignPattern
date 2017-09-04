package com.arron.pattern.factory.normal;

public class FactoryB implements Factory {

    @Override
    public Product getProduct() {
        // TODO Auto-generated method stub
        return new ProductB();
    }
}
