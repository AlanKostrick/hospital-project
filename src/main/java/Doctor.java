
public class Doctor extends HospitalEmployee implements MedicalDuties{
	
	protected String speciality;
	
	public Doctor(String name, String empNumber, String speciality) {
		super(name, empNumber);
		this.speciality = speciality;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	@Override
	public int getPay() {
		return 90000;
	}
	
	@Override
	public boolean drawBlood() {
		return true;
	}
	
	@Override
	public void careForPatient() {
		patientHealth *= 2;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + speciality;
	}

}
