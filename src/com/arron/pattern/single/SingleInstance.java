package com.arron.pattern.single;

public class SingleInstance {

    private static SingleInstance  sSingleInstance;
    
    private String mName;
    
    private SingleInstance(String name) {
        mName = name;
    }
    
    public static SingleInstance getInstance() {
        if (null == sSingleInstance) {
            sSingleInstance = new SingleInstance("非线程安全 饱汉(也叫懒初始化)　单例模式");
        }
        return sSingleInstance;
    }
    
    public String getName() {
        return mName;
    }

}
