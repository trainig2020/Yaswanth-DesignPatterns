package factory;

import beans.Computer;
import beans.Pc;
import beans.Server;

public class ComputerFactory {

	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}
}
