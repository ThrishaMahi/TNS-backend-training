package com.tnsif.ThreadDemo;

public class Thread2 {
	ThreadCom tc;
	public Thread2(ThreadCom tc) {
		super();
		this.tc = tc;
	}
	
	public void run() {
		for(int k=0;k<=5;k++) {
			tc.receive();
		}
	}

	

}
