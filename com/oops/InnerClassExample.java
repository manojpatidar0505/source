package com.oops;

class Outer {
	int num;

 class Inner
	{
		private void print() {
			System.out.println("INNER CLASS PRINT METHOD");
		}
	}

	void displayInnerMethod(int n) {
		
		Inner inner = new Inner();
		inner.print();
		this.num=n;
		System.out.println(num);
		
	}
}

public class InnerClassExample {
public static void main(String[] args) {
	Outer outer = new Outer();
	outer.displayInnerMethod(100);
}

}
