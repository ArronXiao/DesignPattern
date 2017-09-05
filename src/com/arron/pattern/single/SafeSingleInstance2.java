package com.arron.pattern.single;

public class SafeSingleInstance2 {

    private static SafeSingleInstance2 safeSingleInstance2;
    
    private String mName;
    
    private SafeSingleInstance2(String name) {
        mName = name;
    }
    
    private static class  SafeSingleInstanceHolder {
        public static SafeSingleInstance2 holder = new SafeSingleInstance2("线程安全 初始化方式改造　单例模式");
    }
    
    public static SafeSingleInstance2 getInstance() {
        return SafeSingleInstanceHolder.holder;
    }
    
    public String getName() {
        return mName;
    }
    
}
