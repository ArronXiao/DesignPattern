package com.arron.pattern.command;

public class CloseCommand implements BaseCommand<BaseFunction>{

    
    private BaseFunction baseFunction;
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        baseFunction.close();
    }

    @Override
    public void setReceiver(BaseFunction baseFuncation) {
        // TODO Auto-generated method stub
        this.baseFunction = baseFuncation;
    }

}
