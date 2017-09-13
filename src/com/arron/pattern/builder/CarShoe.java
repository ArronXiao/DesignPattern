package com.arron.pattern.builder;

public class CarShoe {

    private int mPrice;
    private String mColor;
    
    public CarShoe(int price,String color) {
        this.mPrice = price;
        this.mColor = color;
    }
    public int getmPrice() {
        return mPrice;
    }
    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }
    public String getmColor() {
        return mColor;
    }
    public void setmColor(String mColor) {
        this.mColor = mColor;
    }
    
}
