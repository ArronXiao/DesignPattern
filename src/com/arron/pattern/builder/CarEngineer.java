package com.arron.pattern.builder;

public class CarEngineer {

    private int mPrice;
    private int mOysterOil;
    
    public CarEngineer(int price ,int oysterOil) {
        this.mPrice = price;
        this.mOysterOil = oysterOil;
    }
    public int getmPrice() {
        return mPrice;
    }
    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }
    public int getmOysterOil() {
        return mOysterOil;
    }
    public void setmOysterOil(int mOysterOil) {
        this.mOysterOil = mOysterOil;
    }
    
    
    
}
