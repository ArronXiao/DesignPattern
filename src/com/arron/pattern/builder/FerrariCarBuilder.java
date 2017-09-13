package com.arron.pattern.builder;

public class FerrariCarBuilder implements CarBuilder{

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "法拉利";
    }

    @Override
    public CarShoe getCarShoe() {
        // TODO Auto-generated method stub
        return new CarShoe(1000,"骚气的红色");
    }

    @Override
    public CarEngineer getCarCarEngineer() {
        // TODO Auto-generated method stub
        return new CarEngineer(1000,1000);
    }

}
