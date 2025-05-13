package com.tnsif.ThreadDemo;

public class ThreadComMain {
	public static void main(String[] args) {
		ThreadCom tc=new ThreadCom();
		Thread1 t1=new Thread1(tc);
		Thread2 t2=new Thread2(tc);
		t1.start();
		
}
}

