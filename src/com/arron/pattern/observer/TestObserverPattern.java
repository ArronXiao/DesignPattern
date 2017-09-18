package com.arron.pattern.observer;

public class TestObserverPattern {

    public static void main(String[] args) {
        
        ConcreteObserved concreteObserved = new ConcreteObserved();
        
        ConcreteObserver concreteObserver = new ConcreteObserver();
        
        concreteObserved.attachObserver(concreteObserver);
        
        concreteObserved.setString("老板来了");
        
        concreteObserved.detachObserver(concreteObserver);
        
        concreteObserved.setString("老板来了");
    }
}
