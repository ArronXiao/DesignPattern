package com.arron.pattern.single;

import com.arron.pattern.utils.Log;

public class TestSingleInstance {

    public static void main(String args[]) {

        SingleInstance siInstance = SingleInstance.getInstance();
        Log.d(siInstance.getName());
        
        SafeSingleInstance siInstance1 = SafeSingleInstance.getInstance();
        Log.d(siInstance1.getName());
        
        SafeSingleInstance1 siInstance2 = SafeSingleInstance1.getInstance();
        Log.d(siInstance2.getName());
        
        
        SafeSingleInstance2 siInstance3 = SafeSingleInstance2.getInstance();
        Log.d(siInstance3.getName());
        

    }

}
