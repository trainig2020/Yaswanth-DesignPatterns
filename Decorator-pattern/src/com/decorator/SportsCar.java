package com.decorator;

public class SportsCar extends DecoratorClass{

	public SportsCar(Car c) {
		super(c);
		
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
}
}