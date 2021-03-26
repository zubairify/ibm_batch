import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager mgr = new Manager("Mili", 9000, 3000);
		Executive exec = new Executive("Polo", 7000, 2000);

		showSalary(mgr);
		showSalary(exec);
	}

	// Polymorphic method
	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)	// Runtime Type Identification
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}

//	private static void showSalary(Executive exec) {
//		System.out.println("Executive Salary: " + exec.getSalary());
//	}
//
//	private static void showSalary(Manager mgr) {
//		System.out.println("Manager Salary: " + mgr.getSalary());
//	}
}
