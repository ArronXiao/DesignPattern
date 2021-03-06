package com.arron.pattern.command;

public interface BaseCommand<T>{

   //最基础的命令的抽象，只有两个功能，一个是指定接收者，一个是执行
   public void execute();
   
   //后面本来可以写一个基类的，但是发现这里使用泛型更好,这里没有对接收者做任何的约束，别人是属于正常功能的一部分
   public void setReceiver(T receiver) ;
}
