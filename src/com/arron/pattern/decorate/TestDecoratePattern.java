package com.arron.pattern.decorate;

import com.arron.pattern.utils.Log;

public class TestDecoratePattern {

    
    public static void main(String[] args) {
        
        Core core = new Core();
        CoreDecorateA coreDecorateA = new CoreDecorateA(core);
        CoreDecorateB coreDecorateB = new CoreDecorateB(coreDecorateA);
        
        //装饰类　A 和　B 是无关紧要的一些附加功能．核心core类并不知道这些装饰类的存在．
        //Ａ包装 core, B包装 A，形成了一个装饰链．
        Log.d(coreDecorateB.getName());
        
        
        //可以自由的更改装饰链的顺序
        coreDecorateB = new CoreDecorateB(core);
        coreDecorateA = new CoreDecorateA(coreDecorateB);
        
        Log.d(coreDecorateA.getName());
    }
}
