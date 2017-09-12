package com.arron.pattern.strategy;

import com.arron.pattern.utils.Log;

public class TestStrategyPattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //我想要进行一场旅行，可以选择不同的交通工具，这就是一种策略
        Travel rTravel = new Travel(1000);
        rTravel.setVehicle(new Car());
        
        Log.d("当你选择汽车来旅行，花费的时间: "+rTravel.getSpentTime());
        
        rTravel.setVehicle(new Aeroplane());
        
        Log.d("当你选择飞机来旅行，花费的时间: "+rTravel.getSpentTime());
        
    }

}
