
public class Nurse extends HospitalEmployee implements MedicalDuties {
	
	protected int numPatients;
	
	public Nurse(String name, String empNumber, int numPatients) {
		super(name, empNumber);
		this.numPatients = numPatients;
	}
	
	public int getNumPatients() {
		return numPatients;
	}
	
	@Override
	public int getPay() {
		return 50000;
	}
	
	@Override
	public boolean drawBlood() {
		return true;
	}
	
	@Override
	public void careForPatient() {
		patientHealth +=5;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + numPatients;
	}

}
