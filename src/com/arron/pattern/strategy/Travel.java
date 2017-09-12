package com.arron.pattern.strategy;

public class Travel {

    private int mTotalDistance;
    private Vehicle mVehicle;
    public Travel(int totalDistance) {
        this.mTotalDistance = totalDistance;
    }
    
    public int getSpentTime() {
        //请原谅我这里没有进行数据的校验等等操作，只是一个demo
        return mTotalDistance / mVehicle.getSpeed();
    }
    
    public void setVehicle(Vehicle vehicle) {
        mVehicle = vehicle;
    }
}
