package com.arron.pattern.state;

public class Solid implements State{

    Water mWater;
    
    public Solid(Water water) {
        // TODO Auto-generated constructor stub
        mWater = water;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "我是固态，我叫冰";
    }

    @Override
    public void setTemperature(int temperature) {
        // TODO Auto-generated method stub
        if(temperature > 0) {
            mWater.setState(new Liquid(mWater));
        }else if(temperature > 100) {
            mWater.setState(new Gas(mWater));
        }
    }

}
