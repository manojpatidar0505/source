package com.oops;

interface abc {
	default void a() {
		System.out.println("default");
	};
}

public class InterEx {
	public static void main(String[] args) {

		abc abc = new abc(){
		
		};

		abc.a();
	}
}
