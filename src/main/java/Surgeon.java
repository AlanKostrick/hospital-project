
public class Surgeon extends Doctor {
	
	protected boolean isOperating;
	
	public Surgeon(String name, String empNumber, String speciality, boolean isOperating) {
		super(name, empNumber, speciality);
		this.isOperating = isOperating;
	}
	
	public boolean checkIfOperating() {
		return isOperating;
	}
	
	@Override
	public int getPay() {
		return 120000;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\t" + isOperating;
	}

}
