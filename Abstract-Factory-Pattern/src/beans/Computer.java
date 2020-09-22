package beans;

public interface Computer {

	public String getRAM();
	public String getHDD();
	public String getCPU();
	
	
	
}


//public abstract class Computer {
//	
//	public abstract String getRAM();
//	public abstract String getHDD();
//	public abstract String getCPU();
//	
//	@Override
//	public String toString(){
//		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
//	}
//}