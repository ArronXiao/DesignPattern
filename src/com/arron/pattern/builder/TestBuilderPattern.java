package com.arron.pattern.builder;

import com.arron.pattern.utils.Log;

public class TestBuilderPattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //将复杂的对象的构造过程进行了封装，只用关心建造者就好了,不必要关系具体的细节
        CarBuilderDirector carBuilderDirector = new CarBuilderDirector(new BenzCarBuilder());
        Car car = carBuilderDirector.getProduct();
        
        Log.d("车的名字 : "+car.getName()+ " --- 车的颜色 : "+car.getColor());
        
        CarBuilderDirector carBuilderDirector2 = new CarBuilderDirector(new FerrariCarBuilder());
        Car car2 = carBuilderDirector2.getProduct();
        
        Log.d("车的名字 : "+car2.getName()+ " --- 车的颜色 : "+car2.getColor());
        
        //如果在car的集成集体下生成子类　法拉利和奔驰　，也仍然需要关注其构造的细节,隔离一个建造者，可以方便新增和解偶
        
        //与工厂模式相比，工厂模式也是产生一个对象，不过工厂模式的控制颗粒度没有工厂模式的高
        //工厂模式取代了构造函数,  建造方法取代了一系列的set方法，　一般情况下，工厂模式就够用了吧，貌似！
    }

}
