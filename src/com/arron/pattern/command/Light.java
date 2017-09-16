package com.arron.pattern.command;

import com.arron.pattern.utils.Log;

//我是真正的功能，具有能够打开开关的功能，实现了打开功能的接口
public class Light implements BaseFunction{

    @Override
    public void open() {
        // TODO Auto-generated method stub
        Log.d("我是灯泡，执行打开操作");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        Log.d("我是灯泡，执行关闭操作");
    }

}
