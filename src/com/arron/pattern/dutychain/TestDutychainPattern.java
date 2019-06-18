package com.arron.pattern.dutychain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.arron.pattern.utils.Log;

public class TestDutychainPattern {

    public static void main(String[] args) {
        
        //手动的设置下一级的处理人是谁，可以在调用时进行指定，非常的灵活
        Loader loader = new CachedLoader();
        Loader loadernext = new LocalLoader();
        loadernext.setNext(new NetLoader());
        loader.setNext(loadernext);
        
        loader.setUrl("test");
        loader.getUrl();
        
        Log.d("第一级责任人有处理 "+loader.getUrl());
        
        //改变条件然后再去获取值
        loader.setUrl(null);
        loadernext.setUrl("test2");
        Log.d("第一级责任人没有处理 "+loader.getUrl());
        
        
        String source = "this---is a test abcd abcd ef";
        String pattern = "(?<=-+)is";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(source);
        while (m.find()) {
            int groupCount = m.groupCount();
            System.out.println("groupCount: " + groupCount);
            for(int i=0; i < groupCount + 1 ; i++) {
                System.out.println("group: "+ i + " ----> " + m.group(i));
            }
          
        }
    }
}
