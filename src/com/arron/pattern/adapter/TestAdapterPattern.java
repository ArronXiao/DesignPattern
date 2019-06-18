package com.arron.pattern.adapter;

import com.arron.pattern.utils.Log;

public class TestAdapterPattern {

    public static void main(String[] args) {
        
        //环境这个类是稳定的，一直调用request 方法
        Environment environment = new Environment(new OldClass());
        Log.d("调用getName : "+ environment.request());
        
        //环境不希望被改动，想跟某个新的方法扯上关系，也不能改新的功能的接口．
        Environment environment２ = new Environment(null);
        OldClassApdapter oldClassApdapter = new OldClassApdapter(new Oldclass2());
        environment２.setOldClass(oldClassApdapter);
        Log.d("调用adapter.getName : "+ environment２.request());
        
        //那么问题就来了，为啥不能直接继承后重写方法呢?
        //这里有一个前提条件，Environment的调用方式是不更改的，Olaclass２的也不能更改，两者都不能变，但是想让Environment使用Olaclass新的功能
        //并不是在设计之初就用这个玩意，是后续的改动这个的折中方法，应该少用比较好
        //这个与android中listview的adapter不是一回事．adapter只是一个桥梁
        
        //环境Environment 比作 二口插座 ，OlderClass是是二口插头， OladerClass2是三口插头， OldClassAdapters是 三口转二口  ，总共四个类
        
    }
    
    
}
