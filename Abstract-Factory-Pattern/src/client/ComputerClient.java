package client;

import beans.Computer;
import factory.ComputerFactory;
import factory.PCFactory;
import factory.ServerFactory;

public class ComputerClient {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.createComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		
		Computer server = ComputerFactory.createComputer(new ServerFactory("2 GB","500 GB","2.4 GHz"));
		
		System.out.println("Pc : "+ pc);
		System.out.println("Server : "+server);
	}

}
