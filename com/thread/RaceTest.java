package com.thread;

public class RaceTest extends Thread {
	private static Race race = new Race();

	public void run() {
		for (int i = 0; i <= 10; i++) {
			race.deposit(1000 + i);
		}

	}
public static void main(String[] args) {
	RaceTest raceTest=new RaceTest();
	raceTest.start();
}
}
