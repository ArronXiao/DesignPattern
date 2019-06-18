package com.arron.pattern.memto;

public class TestMemto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//备忘录模式，将需保存的数据和逻辑放在备忘录中，工作者只需要进行读取和创建就可以完成恢复的动作，
		//如果备忘录还需要做额外的操作，如文件 数据库的读写操作，也可以在外部完成
		//大多数用于恢复现场的， 在所有的UI操作中，需要保留现场，然后做二次恢复的，这种就特别的使用
		Worker worker = new Worker();
		Memto memto = worker.getMemto();
		worker.setMemto(memto);
	}

}
