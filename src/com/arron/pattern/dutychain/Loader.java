package com.arron.pattern.dutychain;

public interface Loader {

    //这是基本功能
    public String getUrl();
    
    public void setUrl(String url);
    
    //这是设置下一级的责任人
    public void setNext(Loader loader);
    
}
