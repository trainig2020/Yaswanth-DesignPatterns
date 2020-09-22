package factory;

import beans.Computer;
import beans.Pc;

public class PCFactory implements ComputerAbstractFactory {

	@Override
	public Computer createComputer() {
		return new Pc(this.RAM, this.HDD, this.CPU);
	}

	private String RAM;
	private String HDD;
	private String CPU;

	public PCFactory(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}
}