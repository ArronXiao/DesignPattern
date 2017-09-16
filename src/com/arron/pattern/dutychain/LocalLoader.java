package com.arron.pattern.dutychain;

public class LocalLoader implements Loader{

    private String url;
    private Loader next;
    
    @Override
    public String getUrl() {
        // TODO Auto-generated method stub
        if (url != null) {
            return url;
        }
        return next.getUrl();
    }

    @Override
    public void setNext(Loader loader) {
        // TODO Auto-generated method stub
        next = loader;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    
}
