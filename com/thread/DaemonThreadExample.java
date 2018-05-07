package com.thread;

public class DaemonThreadExample extends Thread {
	public void run() {
		System.out.println("Daemon T started" + Thread.currentThread());

		while (true)

		{
			try {
				Thread.sleep(500);
				System.out.println("WokeUP again");
			} catch (InterruptedException e) {

			}
		}

	}

	public static void main(String[] args) {
		System.out.println("main Started");
		DaemonThreadExample d = new DaemonThreadExample();
		DaemonThreadExample d1= new DaemonThreadExample();
		d.setDaemon(true);
		d.start();
	
		try {
			System.out.println("try");
			Thread.sleep(1000);
			
		} catch (InterruptedException x) {

		}
		System.out.println("leaving main method");
		System.out.println("JVM EXIT");
	}
}