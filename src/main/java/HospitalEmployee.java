
public abstract class HospitalEmployee {
	
	protected int patientHealth = 10;
	
	protected String name;
	protected String empNumber;
	
	public HospitalEmployee(String name, String empNumber) {
		this.name = name;
		this.empNumber = empNumber;
	}
	
	public String getName() {
		return name;	
	}
	
	public String getEmpNumber() {
		return empNumber;
	}
	
	public int getPatientHealth() {
		return patientHealth;
	}
	
	public abstract int getPay();
	
	@Override
	public String toString() {
		return name + "\t" + empNumber;
	}
}
