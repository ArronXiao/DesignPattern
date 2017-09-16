package com.arron.pattern.proxy;

import java.lang.reflect.Proxy;

public class TestProxyPattern {
    
    public static void main(String args[]) {
        
        ProxyPrint proxyMyPrint = new ProxyPrint(new RealPrint());
        //输入的字体为大小，因为做了一个的代理处理，字符会变成小写．不予实际的类进行交互，而与代理进行交互
        proxyMyPrint.print("静态代理　I LOVE YOU");
        
        
        //静态代理的类需要在编译的时候就确定来类的关系，当有很多类需要被代理处理一遍的的时候，就比较麻烦，使用动态代理
        Print realPrint = new RealPrint();
        DynamicProxyHandler dynamicProxy = new DynamicProxyHandler(realPrint);
        
        Print print = (Print)Proxy.newProxyInstance(dynamicProxy.getClass().getClassLoader(), realPrint.getClass().getInterfaces(), dynamicProxy);
        print.print("动态代理 I LOVE YOU");
    }

}
