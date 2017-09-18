package com.arron.pattern.observer;

import com.arron.pattern.utils.Log;

public class ConcreteObserver implements Observer{

    @Override
    public void update(String str) {
        // TODO Auto-generated method stub
        Log.d("观察者"+this.hashCode()+"  收到消息: "+str+" 我假装工作");
    }

}
