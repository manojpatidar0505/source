package com.thread;

public class Account {
	private int balance = 0;

	public synchronized void deposit(int amt) {
		int bal = getBalance() + amt;
			setBalance(bal);
		
		System.out.println("   Balance is  ---" + bal);
	}

	public int getBalance() {
		
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
}