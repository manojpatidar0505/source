package com.thread;

public class ThreadPriority extends Thread {
	//private String name;

	public ThreadPriority(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " P =" + getPriority());
		}

	}
public static void main(String[] args) {
	ThreadPriority t=new ThreadPriority("Thread A");
	ThreadPriority t2=new ThreadPriority("Thread B");

	ThreadPriority t3=new ThreadPriority("Thread C");
	t.setPriority(3);
	t2.setPriority(10);
	t.start();
	t2.start();
	t3.start();

}
}
