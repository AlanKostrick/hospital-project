

public class HospitalApp {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();

		HospitalEmployee phil = new Doctor("Phil", "111", "Brain");
		HospitalEmployee harrison = new Surgeon("Harry", "222", "Plastic", true);
		HospitalEmployee jackie = new Nurse("Jackie", "333", 6);
		HospitalEmployee janine = new Receptionist("Janine", "444", true);
		HospitalEmployee rosie = new Janitor("Rosie", "555", true);

		hospital.addEmployee(phil);
		hospital.addEmployee(harrison);
		hospital.addEmployee(jackie);
		hospital.addEmployee(janine);
		hospital.addEmployee(rosie);

		System.out.println("Here are the employees at High St. Hospital");
		for (HospitalEmployee currentEmp : hospital.getEmployees()) {
			System.out.println(currentEmp);
		}

		System.out.println("\nHere are the pay rates at High St. Hospital");
		for (HospitalEmployee currentEmp : hospital.getEmployees()) {
			System.out.println(currentEmp.getName() + " gets paid a salary of " +
		       currentEmp.getPay() + " per year.");
		}

		System.out.println("\nSome Employees can draw blood");
		for (HospitalEmployee currentEmp : hospital.getEmployees()) {
			if (currentEmp instanceof Doctor) {
				if (((Doctor) currentEmp).drawBlood()) {
					System.out.println(currentEmp.name + " is capable of drawing blood.");
				}
			}
			if (currentEmp instanceof Nurse) {
				if (((Nurse) currentEmp).drawBlood()) {
					System.out.println(currentEmp.name + " is capable of drawing blood.");
				}
			}

		}

		System.out.println("\nSome Employees can administer patient care");
		for (HospitalEmployee currentEmp : hospital.getEmployees()) {
			if (currentEmp instanceof Doctor) {
				((Doctor) currentEmp).careForPatient();
				System.out.println(
						currentEmp.getName() + " has increased patient health to " + currentEmp.getPatientHealth());
			}

			if (currentEmp instanceof Nurse) {
				((Nurse) currentEmp).careForPatient();
				System.out.println(
						currentEmp.getName() + " has increased patient health to " + currentEmp.getPatientHealth());
			}
		}
	}

}
