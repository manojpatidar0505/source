package com.thread;

import java.util.Iterator;

public class ThreadCreation1 extends Thread {
	private String name = null;

	public ThreadCreation1(String name) {
		this.name = name;
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"#"+name);
			
		}
	}
	public static void main(String[] args) {
		ThreadCreation1 t=new ThreadCreation1("manoj");
		ThreadCreation1 t1=new ThreadCreation1("patidar");
		t.start();
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println("IN MAIN-----"+i);
			
		}
	}

}
