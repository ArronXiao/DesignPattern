package com.arron.pattern.observer;

public interface Observed {

    public void notifyToOberser();
    
    public void attachObserver(Observer observer);
    
    public void detachObserver(Observer observer);
}
