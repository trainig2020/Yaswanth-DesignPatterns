package client;

import beans.Computer;
import factory.ComputerFactory;
import factory.ComputerType;

public class ComputerClient {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.createComputer(ComputerType.Pc, "1GB", "256GB", "Intel Core 2 Duo");

		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "AMD Ryzen 7 2700X");
		
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

}
