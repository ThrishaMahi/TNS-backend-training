package com.tnsif.ThreadDemo;

import com.tns.Demo;
//runnable Interface
public class ThreadRun extends Demo implements Runnable {
	String name;
	public ThreadRun(String name) {
		this.name=name;
	}
	@Override
	public void run() {
     for(int i=0;i<5;i++) {
   	  System.out.println("The current thread"+name);
   	  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }	
	}
}
