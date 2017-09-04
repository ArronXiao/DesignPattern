package com.arron.pattern.factory.abstracter;

public class ComplexProductA implements ComplexProduct{

    String mFactoryName = "";
    public ComplexProductA(String factoryName) {
        // TODO Auto-generated constructor stub
        mFactoryName = factoryName;
    }
    
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "factoryName: "+ mFactoryName + "  product :ComplexProductA";
    }

}
