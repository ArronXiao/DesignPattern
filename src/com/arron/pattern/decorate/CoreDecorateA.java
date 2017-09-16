package com.arron.pattern.decorate;

public class CoreDecorateA extends Core{

    private Core core;
    
    public CoreDecorateA(Core core) {
        // TODO Auto-generated constructor stub
        this.core = core;
    }
    
    @Override
    public String getName() {
        return "I am CoreDecorateA decorate < "+core.getName()+" >";
    }
    
}
