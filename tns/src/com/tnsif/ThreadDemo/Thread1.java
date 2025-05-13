package com.tnsif.ThreadDemo;

public class Thread1 extends Thread {
	ThreadCom tc;
	public Thread1(ThreadCom tc) {
		super();
		this.tc = tc;
	}
	
	public void run() {
		for(int j=1;j<5;j++) {
			tc.deliver();
		}

	}
}
