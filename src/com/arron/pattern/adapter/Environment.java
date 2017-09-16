package com.arron.pattern.adapter;

//这个固有的类，不希望对它进行改动
public class Environment {

    OldClass mOldclass ;
    public Environment(OldClass oldlcass) {
        // TODO Auto-generated constructor stub
        mOldclass = oldlcass;
    }
    
    
    public void setOldClass(OldClass oldlcass) {
        mOldclass = oldlcass;
    }
    
    public String request() {
        return mOldclass.getOldName();
    }
}
