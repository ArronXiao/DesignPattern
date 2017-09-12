package com.arron.pattern.clone;

public class Sample implements Cloneable {

    
    private int a = 1;
    private int b = 2;
    private int c = 3;
    
    public Sample() {
        
    }

    public Sample(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    protected Sample clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        //如果没有拷贝的设计模型，那么这些操作都需要放到调用者那一端去做，就非常的麻烦
        Sample newSample = new Sample();
        newSample.setA(a);
        newSample.setB(b);
        newSample.setC(b);
        //不考虑深浅拷贝的问题，这里的拷贝模式只是提供了一种快速的生成对象副本的方案．
        return newSample;
    }
    
}
