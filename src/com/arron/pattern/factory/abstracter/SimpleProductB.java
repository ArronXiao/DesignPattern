package com.arron.pattern.factory.abstracter;

public class SimpleProductB implements SimpleProduct{

    
    String mFactoryName = "";
    public SimpleProductB(String factoryName) {
        // TODO Auto-generated constructor stub
        mFactoryName = factoryName;
    }
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "factoryName: "+ mFactoryName + "  product :SimpleProductB";
    }

}
