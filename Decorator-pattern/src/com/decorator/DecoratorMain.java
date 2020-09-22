package com.decorator;

public class DecoratorMain {

	public static void main(String[] args) {

		SportsCar sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n******");
		LuxoriousCar luxoriousCar = new LuxoriousCar(new SportsCar(new BasicCar()));
		luxoriousCar.assemble();
	}
}
