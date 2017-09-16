package com.arron.pattern.dutychain;

import com.arron.pattern.utils.Log;

public class TestDutychainPattern {

    public static void main(String[] args) {
        
        //手动的设置下一级的处理人是谁，可以在调用时进行指定，非常的灵活
        Loader loader = new CachedLoader();
        Loader loadernext = new LocalLoader();
        loadernext.setNext(new NetLoader());
        loader.setNext(loadernext);
        
        loader.setUrl("test");
        loader.getUrl();
        
        Log.d("第一级责任人有处理 "+loader.getUrl());
        
        //改变条件然后再去获取值
        loader.setUrl(null);
        loadernext.setUrl("test2");
        Log.d("第一级责任人没有处理 "+loader.getUrl());
 
    }
}
