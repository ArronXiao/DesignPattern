package com.arron.pattern.command;

public class OpenCommand implements BaseCommand<BaseFunction>{

    private BaseFunction baseFunction;
    
    //这里传递的仍然是接口，只要有某个实现了某个功能的具体类就可以
    @Override
    public void setReceiver(BaseFunction baseFuncation) {
        // TODO Auto-generated method stub
        this.baseFunction = baseFuncation;
    }
    
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        baseFunction.open();
    }

 

}
