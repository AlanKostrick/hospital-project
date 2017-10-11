import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
	
	private Map<String, HospitalEmployee> employees = new HashMap<String,HospitalEmployee>();
	
	
	public Collection<HospitalEmployee> getEmployees(){
		return employees.values();
	}
	
	//add an employee to the company
	public void addEmployee (HospitalEmployee employee) {
		employees.put(employee.getEmpNumber(), (HospitalEmployee) employee);
	}
	
	//fire an employee from the company
	public void fireEmployee(HospitalEmployee employee) {
		employees.remove(employee.getEmpNumber());
	}
	

}
