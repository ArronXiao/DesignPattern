package com.arron.pattern.memto;

public class Worker {

	private String state = "我是工作者状态";
	
	public Memto getMemto() {
		return new Memto(state);
	}
	
	public void setMemto(Memto memto) {
		this.state = memto.getState();
	}
	
}
