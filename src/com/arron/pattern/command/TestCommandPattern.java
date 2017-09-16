package com.arron.pattern.command;

public class TestCommandPattern {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {
        
        BaseCommand openCommand = new OpenCommand();
        openCommand.setReceiver(new Light());
        openCommand.execute();
        
        BaseCommand closeCommand = new CloseCommand();
        closeCommand.setReceiver(new Light());
        closeCommand.execute();
        
        //上面的调用还是复杂了，可以再封装一个调用者，批量调用命令，如果不封装一个调用者，命令模式就没啥用，难道为了命名模式而命令模式？
        //在调用者中可以对这些命令进行排序记录控制，以及回退等控制操作
        
        Invoker invoker = new Invoker();
        invoker.addCommand(openCommand);
        invoker.addCommand(closeCommand);
        
        invoker.ExcuteCommand();
        
        //命令模式的有趣的地方在于，正常的功能类(也就具体的执行者)是不知道有命令这么回事存在的，
        //是命令依赖于具体的执行者，而不是执行者要知道命令.这样就可以大胆放心的实现具体的功能，该怎么做就怎么做，后期有需要使用命令模式再说．
        
        //对于命令模式来说，命令是额外附加的，真正的接收才是主要的功能．
    }
    
}
