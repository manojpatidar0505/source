package com.oops;

public class Child extends Parent {

	@Override
	void run() {
		System.out.println("Hello");
	}
public static void main(String[] args) {
	Parent parent=new Parent() {
		
		@Override
		void run() {
		System.out.println("hello1");	
		}
	};parent.run();
}
}
