package trng.imcs.maven.core;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int empNo;
	private String name;
	private float salary;
	private int deptNo;
	private Date doJoin;
	public Employee(int empNo, String name, float salary, Date doJoin) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.doJoin = doJoin;
	}
	
	
	
}
