package client;

import beans.Computer;
import beans.ComputerBuilderDirector;

public class ComputerClient {

	public static void main(String[] args) {

		Computer comp = new Computer.Builder("2GB", "2TB", "Intel i7").build();
		
		Computer comp1 = new Computer.Builder("2GB", "2TB", "Intel i7").setGraphicsCardEnabled(true).build();
		
		Computer comp3 = new ComputerBuilderDirector().getBasicComputer();
		
		System.out.println(comp);
		System.out.println(comp1);
		System.out.println(comp3);
		
	}

}
