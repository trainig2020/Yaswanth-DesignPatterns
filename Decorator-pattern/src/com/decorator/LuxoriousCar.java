package com.decorator;

public class LuxoriousCar extends DecoratorClass{

	public LuxoriousCar(Car c) {
		super(c);
		
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Luxary Car.");
}
}