package com.arron.pattern.builder;

public class Car {

    //如果有一样车，其实我并不愿意关心车的轮子啊等等，我只关系车的价格，速度等其它属性
    CarShoe mCarShoe;
    CarEngineer mCarEngineer;
    String mName;
    
    Car(String name, CarShoe carshoe , CarEngineer carEngineer) {
        this.mName = name;
        this.mCarShoe = carshoe;
        this.mCarEngineer = carEngineer;
    }
    
    public String getName() {
        return mName;
    }
    
    public String getColor() {
        return "轮子是　"+mCarShoe.getmColor() + " 引擎的排量：　"+ mCarEngineer.getmOysterOil();
    }
 
}
