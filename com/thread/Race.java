package com.thread;

public class Race {
	private int balance=0;
	public synchronized void deposit(int amt){
		int bal=getBalance()+amt;
		System.out.print(getBalance()+"+"+amt+":");
		
		setBalance(bal);
		System.out.println(bal);
		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
