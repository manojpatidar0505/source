package com.thread;

public class ThreadCreation2 implements Runnable {
private String name=null;
public ThreadCreation2(String name) {
	this.name=name;
}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i+"#"+name);
		}
		
	}
	public static void main(String[] args) {
		Thread thread=new Thread(new ThreadCreation2("manoj"));
		Thread thread1=new Thread(new ThreadCreation2("patidar"));
		thread.start();
		thread1.start();
		
	}

}
