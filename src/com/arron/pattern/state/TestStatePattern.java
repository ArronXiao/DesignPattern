package com.arron.pattern.state;

public class TestStatePattern {

    
    public static void main(String[] args) {
        
        //随着某一个条件的变法，对于来看，对象的行为自发的发生了改变．就像是产生了一个新的对象一样
        //对于状态模式来说，这个触发的条件可以是调用产生的，也可以随着时间，或者某些不定的条件产生的，效果是一样的
        //在本例子中，转移状态的过程可以放在Water中，也可以放在具体state中，两者都是可行的
        Water water = new Water();
        water.getStateName();
        
        water.heat(20);
        water.getStateName();
        
        water.heat(100);
        water.getStateName();
        
    }
}
