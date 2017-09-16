package com.arron.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.arron.pattern.utils.Log;

public class DynamicProxyHandler implements InvocationHandler{

    private Print mRealPrint;
    
    public  DynamicProxyHandler(Print realPrint) {
        mRealPrint = realPrint;
        
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        
        beforeOperation();
        
        method.invoke(mRealPrint, args);
        
        return null;
    }
    
    private void beforeOperation() {
        Log.d("\n我是动态代理前面的操作");
    }
    
    

}
