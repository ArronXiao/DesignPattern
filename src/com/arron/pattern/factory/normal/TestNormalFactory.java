package com.arron.pattern.factory.normal;

import com.arron.pattern.utils.Log;

public class TestNormalFactory {
    private static final String TAG = "工厂模式测试";

    public static void main(String[] args) {
        // 工程模式的测试
        // 需要知道具体的工厂就好，不需要知道具体的产品，非常的容易的扩展
        Factory factory = new FactoryA();
        Product product = factory.getProduct();
        Log.d(TAG, product.getName());

        factory = new FactoryB();
        product = factory.getProduct();
        Log.d(TAG, product.getName());
        // 遵守了封闭-开放原则！是真正意义上的工厂模式
    }
}
