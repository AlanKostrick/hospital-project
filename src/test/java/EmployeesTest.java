import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeesTest {

	
//	@Test
//	public void shouldBeAbleToCreateAHospitalEmployee() {
//		HospitalEmployee underTest = new HospitalEmployee(null, null);
//		assertNotNull(underTest);
//	}
	
	@Test
	public void shouldBeAbleToCreateADoctor() {
		Doctor underTest = new Doctor(null, null,null);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatADoctorIsAHospitalEmployee() {
		HospitalEmployee underTest = new Doctor(null, null, null);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCreateANurse() {
		Nurse underTest = new Nurse(null, null,0);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatANurseIsAHospitalEmployee() {
		HospitalEmployee underTest = new Nurse(null, null, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCreateAJanitor() {
		Janitor underTest = new Janitor(null, null,true);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatAJanitorIsAHospitalEmployee() {
		HospitalEmployee underTest = new Janitor(null, null, true);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCreateAReceptionist() {
		Receptionist underTest = new Receptionist(null, null,true);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatARecptionistIsAHospitalEmployee() {
		HospitalEmployee underTest = new Receptionist(null, null, true);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCreateASurgeon() {
		Surgeon underTest = new Surgeon(null, null, null, true);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatASurgeonIsADoctor() {
		Doctor underTest = new Surgeon(null, null, null,true);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatANurseShouldBeAbleToDrawBlood() {
		Nurse underTest = new Nurse(null,null,0);
		underTest.drawBlood();
		
		assertEquals(true, underTest.drawBlood());
	}
	
	
	@Test
	public void assertThatADoctorShouldGetPaid90k() {
		Doctor underTest = new Doctor(null,null,null);
		
		assertEquals(90000, underTest.getPay());
	}
	
	@Test
	public void assertThatASurgeonShouldGetPaid120k() {
		Surgeon underTest = new Surgeon(null,null,null,true);
		
		assertEquals(120000, underTest.getPay());
	}
	
	@Test
	public void assertThatANurseShouldGetPaid50k() {
		Nurse underTest = new Nurse(null,null,0);
		
		assertEquals(50000, underTest.getPay());
	}
	
	@Test
	public void assertThatAReceptionistShouldGetPaid45k() {
		Receptionist underTest = new Receptionist(null,null,true);
		
		assertEquals(45000, underTest.getPay());
	}
	
	@Test
	public void assertThatAJanitorShouldGetPaid40k() {
		Janitor underTest = new Janitor(null,null,true);
		
		assertEquals(40000, underTest.getPay());
	}
	
	@Test
	public void assertThanADoctorShouldBeAbleToDrawBlood() {
		Doctor underTest = new Doctor(null,null,null);
		underTest.drawBlood();
		
		assertEquals(true, underTest.drawBlood());
	}
	
	@Test
	public void assertThanASurgeonShouldBeAbleToDrawBlood() {
		Surgeon underTest = new Surgeon(null,null,null,true);
		underTest.drawBlood();
		
		assertEquals(true, underTest.drawBlood());
	}
	
	@Test
	public void assertThanANurseShouldBeAbleToCareForPatientAndIncreaseHealthTo15() {
		Nurse underTest = new Nurse(null,null,0);
		underTest.careForPatient();
		
		assertEquals(15, underTest.getPatientHealth());
	}
	
	@Test
	public void assertThatADoctorShouldBeAbleToCareForPatientAndIncreaseHealthTo20() {
		Doctor underTest = new Doctor(null,null,null);
		underTest.careForPatient();
		
		assertEquals(20, underTest.getPatientHealth());
	}
	
	@Test
	public void assertThatASurgeonShouldBeAbleToCareForPatientAndIncreaseHealthTo20() {
		Surgeon underTest = new Surgeon(null,null,null, true);
		underTest.careForPatient();
		
		assertEquals(20, underTest.getPatientHealth());
	}
	
	
}
