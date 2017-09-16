package com.arron.pattern.proxy;

import com.arron.pattern.utils.Log;

public class ProxyPrint implements Print {

    private RealPrint mMyprint; 
    
    public ProxyPrint(RealPrint myPrint){
        mMyprint = myPrint;
    }
    
    
    @Override
    public void print(String str) {
        // TODO Auto-generated method stub
        Log.d("静态代理前　str : "+str);
        //在这里可以做很多操作：比如对传递的数据进行检验，加工处理，这里模拟字符串变小写
        str = str.toLowerCase();
        mMyprint.print(str);
        
    }

}
