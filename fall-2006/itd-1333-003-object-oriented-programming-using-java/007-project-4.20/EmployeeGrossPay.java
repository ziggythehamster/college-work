///////////////////////////////////////////////////////////////////////////////
// EmployeeGrossPay.java
///////////////////////////////////////////////////////////////////////////////
//
// Uses the Employee class to get the gross pay of employees.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: EmployeeGrossPay.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

import java.util.Scanner;

public class EmployeeGrossPay {
	public static void main(String args[]) {
		// required vars
		Scanner input;
		int i = 0;
		Employee[] employees = new Employee[3];
		// temporary stuff
		String s;
		double d;
		
		// Welcome the user.
		System.out.printf("CONGLOM-O EMPLOYEE GROSS PAY SYSTEM\n");
		
		while (i < 3) {
			input = new Scanner(System.in);
			employees[i] = new Employee();
			// ask for name
			System.out.printf("Employee %d Name: ", i+1);
			s = input.nextLine();
			employees[i].setEmployeeName(s);
			System.out.printf("Employee %d Hourly Rate: ", i+1);
			d = input.nextDouble();
			employees[i].setHourlyRate(d);
			System.out.printf("Employee %d Hours Worked: ", i+1);
			d = input.nextDouble();
			employees[i].setHoursWorked(d);
			i++;
		}
		
		// print results
		System.out.printf("GROSS PAY FOR 3 EMPLOYEES\n");
		System.out.printf("\n\n\n");
		for(i = 0; i < 3; i++) {
			System.out.printf("%s\n    $%.2f/hr\t@ %.1fh \t = $%.2f\n", employees[i].getEmployeeName(), employees[i].getHourlyRate(), employees[i].getHoursWorked(), employees[i].getTotalPay());
		}
	}
}