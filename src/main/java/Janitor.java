
public class Janitor extends HospitalEmployee{
	
	protected boolean isSweeping;
	
	public Janitor(String name, String empNumber, boolean isSweeping) {
		super(name, empNumber);
		this.isSweeping = isSweeping;
	}
	
	public boolean checkIfSweeping() {
		return isSweeping;
	}
	
	@Override
	public int getPay() {
		return 40000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + isSweeping;
	}

}
