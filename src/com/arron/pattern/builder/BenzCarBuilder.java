package com.arron.pattern.builder;

public class BenzCarBuilder implements CarBuilder{

    
    public String getName(){
        return "奔驰";
    }
    
    @Override
    public CarShoe getCarShoe() {
        // TODO Auto-generated method stub
        return new CarShoe(100,"黑色");
    }

    @Override
    public CarEngineer getCarCarEngineer() {
        // TODO Auto-generated method stub
        return new CarEngineer(100, 100);
    }

}
