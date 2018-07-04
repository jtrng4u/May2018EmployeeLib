package trng.imcs.maven.core;

import org.apache.commons.lang3.StringUtils;

public class EmployeeHelper {

	public static float calculateGross(Employee emp) {
		return emp.getSalary()  + 200;
	}
	
	public static boolean isValidData(Employee emp) {
		if (StringUtils.isEmpty(emp.getName())) {
			return false;
		}
		
		return true;
	}
}
