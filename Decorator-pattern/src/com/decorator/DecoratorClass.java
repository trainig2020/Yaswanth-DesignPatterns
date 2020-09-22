package com.decorator;

public class DecoratorClass implements Car{
	
	protected Car car;
	
	public  DecoratorClass(Car c) {
		this.car=c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
		
	}

}
