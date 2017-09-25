package com.arron.pattern.state;

public class Gas implements State{

    Water mWater;
    public Gas(Water water){
        mWater = water;
    }
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "我是气态，我叫水蒸汽";
    }

    @Override
    public void setTemperature(int temperature) {
        // TODO Auto-generated method stub
        if(0 < temperature && temperature < 100) {
            mWater.setState(new Liquid(mWater));
        }
        
        if(temperature < 0) {
            mWater.setState(new Solid(mWater));
        }
    }

}
