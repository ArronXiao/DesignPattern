package com.arron.pattern.factory.simple;

import com.arron.pattern.utils.Log;


public class TestSimpleFactory {
	private static final String TAG = "简单工厂模式测试";
	public static void main(String[] args){
		//简单工程模式的测试使用
		//只需要知道一个抽象的Product，以及对应的产品的类型
		Product product = SimpleFactory.getProduct("A");
		Log.d(TAG,product.getName());
		
		product = SimpleFactory.getProduct("B");
		Log.d(TAG,product.getName());
		//如果需要增加额外的产品，就需要新增一个产品类，以及修改SimpleFactory
		//这样就破坏了封闭-开放原则！虽然简单工程模式其实在实际的工程是很有用的。
	}
	
}
