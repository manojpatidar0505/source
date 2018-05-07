package com.oops;

public class Bike extends Vehicle {
	public int run() {
		System.out.println("BIke");
		return 0;
	}


	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();
		Vehicle vehicle = new Bike();
		vehicle.run();
		Vehicle vehicle2 = new Bike();
		vehicle2.run();
	}
}