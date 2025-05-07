package com.tnsif.interfacedemo;

public class BankMain {
	public static void main(String args[]) {
		BankImple b=new BankImple();
		b.withdraw(5000);
		b.deposit(2000);
	}

}
