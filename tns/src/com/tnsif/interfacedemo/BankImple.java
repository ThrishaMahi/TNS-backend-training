package com.tnsif.interfacedemo;

public class BankImple implements Bank {
	double balance=20000;

	@Override
	public void withdraw(double amount) {
		
		if(amount>0 && amount<balance) {
			balance=balance-amount;
			System.out.println("Balance after withdraw"+balance);
			
			
		}
		else {
			System.err.println();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {
		if(amount<deposit_limit) {
			balance = balance+amount;
			System.out.println("Balance after deposit"+balance);
			
		}
		// TODO Auto-generated method stub
		else {
			System.err.println();
		}
		
	}
	

}
