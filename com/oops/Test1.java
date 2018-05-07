package com.oops;

public class Test1 implements Test {

	@Override
	public void run() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Test test = new Test() {

			@Override
			public void run() {
				System.out.println("Hello1");

			}
		};
		System.out.println(test.getClass().getName());
		test.run();
	}
}
