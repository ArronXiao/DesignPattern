package com.arron.pattern.clone;

import com.arron.pattern.utils.Log;

public class TestClonePattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Sample sample = new Sample(6,7,8);
        
        try {
            Sample newsample =  sample.clone();
            
            Log.d("拷贝生成一个对象的副本　，是一个新的内容　sample == newsample : " + (sample == newsample) );
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
