package com.arron.pattern.decorate;

public class CoreDecorateB extends Core {

  private Core core;
    
    public CoreDecorateB(Core core) {
        // TODO Auto-generated constructor stub
        this.core = core;
    }
    
    @Override
    public String getName() {
        return "I am CoreDecorateB decorate < "+core.getName()+" >";
    }
}
