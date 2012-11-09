///////////////////////////////////////////////////////////////////////////////
// Employee.java
///////////////////////////////////////////////////////////////////////////////
//
// An employee class. Stores their name, how much they get paid, how long they
// work, and how much money to give them.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: Employee.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

public class Employee {
	private String p_employeeName;
	private double p_hourlyRate;
	private double p_hoursWorked; // they might work half hours...
	
	// employeeName
	public void setEmployeeName(String s) {
		p_employeeName = s;
	}
	public String getEmployeeName() {
		return p_employeeName;
	}
	
	// hourlyRate
	public void setHourlyRate(double d) {
		p_hourlyRate = d;
	}
	public double getHourlyRate() {
		return p_hourlyRate;
	}
	
	// hoursWorked
	public void setHoursWorked(double d) {
		p_hoursWorked = d;
	}
	public double getHoursWorked() {
		return p_hoursWorked;
	}
	
	// getTotalPay: Returns total pay
	public double getTotalPay() {
		if (p_hoursWorked > 40) {
			// they worked here more than 40 hours, compute overtime
			double overtime;
			overtime = p_hoursWorked - 40;
			
			return (40 * p_hourlyRate) + (overtime * (p_hourlyRate * 1.5));
		} else {
			// they worked 40 hours or less
			return p_hoursWorked * p_hourlyRate;
		}
	}
}