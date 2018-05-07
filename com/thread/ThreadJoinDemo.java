package com.thread;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadJoinDemo {
public static void main(String[] args) throws InterruptedException {
	MyThread t=new MyThread();
	t.start();
	t.join(); 
	for(int i=0;i<5;i++)
	{
	System.out.println("main Thread");
	}
}
}
