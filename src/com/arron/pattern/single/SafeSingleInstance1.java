package com.arron.pattern.single;

public class SafeSingleInstance1 {

    //这种单例模式的坏处在于，只要加载类，类就完成了实例化，不是一个友好的设计
    private static SafeSingleInstance1  sSingleInstance = new SafeSingleInstance1("线程安全 饿汉　单例模式");
    
    private String mName;
    
    private SafeSingleInstance1(String name) {
        mName = name;
    }
    
    public static SafeSingleInstance1 getInstance() {
        return sSingleInstance;
    }

    public String getName() {
        return mName;
    }
}
