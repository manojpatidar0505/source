package com.thread;

public class RacingCondition extends Thread {
	private static Account account = new Account();


	public void run() {
		for (int i = 0; i < 5; i++) {
			account.deposit(1000);
		}
	}

	public static void main(String[] args) {
		RacingCondition condition = new RacingCondition();
		RacingCondition condition2 = new RacingCondition();
		condition.start();
		condition2.start();
	}
}
