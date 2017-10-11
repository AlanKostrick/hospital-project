
public class Receptionist extends HospitalEmployee{
	
	protected boolean isAnswering;
	
	public Receptionist(String name, String empNumber, boolean isAnswering) {
		super(name, empNumber);
		this.isAnswering = isAnswering;
	}
	
	public boolean checkIfOnPhone() {
		return isAnswering;
	}
	
	public int getPay() {
		return 45000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + isAnswering;
	}

}