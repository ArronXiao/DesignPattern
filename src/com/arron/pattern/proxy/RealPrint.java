package com.arron.pattern.proxy;

import com.arron.pattern.utils.Log;

public class RealPrint implements Print{

    @Override
    public void print(String str) {
        // TODO Auto-generated method stub
       Log.d(str);
    }

}
