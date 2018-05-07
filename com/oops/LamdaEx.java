package com.oops;
interface lam{
	int add(int a,int b);
}
public class LamdaEx {
	public static void main(String[] args) {
		lam lam=(a,b)->(a+b);
		System.out.println(lam.add(10, 20));
		lam lam2=(int a,int b)->(a+b);
		System.out.println(lam2.add(100, 200));
	}

}
