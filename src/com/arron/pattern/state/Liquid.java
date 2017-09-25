package com.arron.pattern.state;

public class Liquid implements State{

    
    Water mWater;
    public Liquid(Water water){
        mWater = water;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "我是液态，我叫水";
    }

    @Override
    public void setTemperature(int temperature) {
        // TODO Auto-generated method stub
        if(temperature > 100) {
            mWater.setState(new Gas(mWater));
        }
        
        if(temperature < 0) {
            mWater.setState(new Solid(mWater));
        }
    }

}
