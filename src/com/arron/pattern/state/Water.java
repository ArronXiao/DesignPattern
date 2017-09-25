package com.arron.pattern.state;

import com.arron.pattern.utils.Log;

public class Water {

    private State state;
    private int temperature = -10;
    
    public Water() {
        setState(new Solid(this));
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void getStateName(){
       String str =  state.getName();
       Log.d(str);
    }
    
    public void heat(int temperature){
        this.temperature = this.temperature + temperature;
        if (null != state ) {
            state.setTemperature(this.temperature);
        }
       
    }
    
}
