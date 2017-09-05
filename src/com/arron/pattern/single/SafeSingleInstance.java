package com.arron.pattern.single;

public class SafeSingleInstance {


    //如果是下面这样的加锁方式，是一定要有volatile关键字的
    private static volatile SafeSingleInstance sSingleInstance;

    private String mName;

    private SafeSingleInstance(String name) {
        mName = name;
    }

    //可以直接把整个方法锁住，不过代价比较大，这种方法是直接锁getInstance方法的改良版
    public static SafeSingleInstance getInstance() {
        if (null == sSingleInstance) {
            synchronized (SafeSingleInstance.class) {
                if (null == sSingleInstance) {
                    sSingleInstance = new SafeSingleInstance("线程安全 双重锁的　单例模式");
                }
            }
        }
        return sSingleInstance;
    }

    public String getName() {
        return mName;
    }

}
