package com.tnsif.interfacedemo;

public interface Bank {
	
	long deposit_limit=25000;
	void withdraw(double amount);
	void deposit(double amount);

}
