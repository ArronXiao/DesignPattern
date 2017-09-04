package com.arron.pattern.factory.abstracter;


import com.arron.pattern.factory.normal.Product;
import com.arron.pattern.utils.Log;

public class TestAbstractFactory {

    private static final String TAG = "抽象模式测试";

    public static void main(String[] args) {
        //将对象的具体创建隔离开，关系的只是抽象的接口或者抽象类
        AbstractFactory factoryC = new ConcreteFactoryC();
        SimpleProduct simpleProduct = factoryC.getSimpleProduct();
        ComplexProduct complexProduct = factoryC.getComplexProduct();
        Log.d(TAG, simpleProduct.getName());
        Log.d(TAG, complexProduct.getName());
        
      //替换一个具体的工厂，就替换了一个系列的产品．将产品的组合放到了具体的类中
        
        AbstractFactory factoryD = new ConcreteFactoryD();
        simpleProduct = factoryD.getSimpleProduct();
        complexProduct = factoryD.getComplexProduct();
        Log.d(TAG, simpleProduct.getName());
        Log.d(TAG, complexProduct.getName());
    }
}
