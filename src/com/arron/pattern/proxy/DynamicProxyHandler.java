package com.arron.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.arron.pattern.utils.Log;

public class DynamicProxyHandler implements InvocationHandler{

  
    
    public  DynamicProxyHandler() {
    
        
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        
    	 //如果传进来是一个已实现的具体类（本次演示略过此逻辑)
        if (Object.class.equals(method.getDeclaringClass())) {  
            try {  
            	  beforeOperation();
                return method.invoke(proxy, args);  
            } catch (Throwable t) {  
                t.printStackTrace();  
            }  
        //如果传进来的是一个接口（核心)
        } else {  
            return run(proxy, method, args);  
        }  
        
        return null;
    }
    
    /**
       * 实现接口的核心方法 
     * @param method
     * @param args
     * @return
     */
    public Object run(Object proxy, Method method,Object[] args){  
        //TODO         
        //如远程http调用
        //如远程方法调用（rmi)
        //....
 
       return "method call success!";
    }  

    
    private void beforeOperation() {
        Log.d("\n我是动态代理前面的操作");
    }
    
    

}
