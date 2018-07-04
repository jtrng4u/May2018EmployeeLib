package trng.imcs.maven.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class EmployeeHelperTest {

	@Test
	public void testCalculateGross() {
		// given
		Employee employee = new Employee(101, "Raj", 4000, new Date());

		// when
		float actualGrossSalary = EmployeeHelper.calculateGross(employee);

		// then assert
		assertEquals(employee.getSalary() + 200, actualGrossSalary, 0);
	}

	@Test
	public void testIsValidDataForInvalidEmployeeName() {
		// given
		Employee employee = new Employee(101, "", 4000, new Date());

		// when
		boolean condition = EmployeeHelper.isValidData(employee);

		// then assert
		assertFalse(condition);
	}

	@Test
	public void testIsValidDataForValidEmployeeName() {
		// given
		Employee employee = new Employee(101, "Raj", 4000, new Date());

		// when
		boolean condition = EmployeeHelper.isValidData(employee);

		// then assert
		assertTrue(condition);
	}
}
