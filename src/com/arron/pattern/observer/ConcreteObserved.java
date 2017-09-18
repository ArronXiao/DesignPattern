package com.arron.pattern.observer;

import java.util.ArrayList;

import com.arron.pattern.utils.Log;


public class ConcreteObserved implements Observed{

    ArrayList<Observer> mList = new ArrayList<>();
    String mStr;
    
    @Override
    public void notifyToOberser() {
        // TODO Auto-generated method stub
        for(Observer observer : mList) {
            observer.update(mStr);
        }
    }

    @Override
    public void attachObserver(Observer observer) {
        // TODO Auto-generated method stub
        mList.add(observer);
        Log.d("被观察者  观察者"+observer.hashCode()+" 订阅我了");
    }

    @Override
    public void detachObserver(Observer observer) {
        // TODO Auto-generated method stub
        mList.remove(observer);
        Log.d("被观察者 观察者"+observer.hashCode()+" 取消订阅我");
    }

    
    public void setString(String str) {
        mStr = str;
        notifyToOberser();
    }
}
