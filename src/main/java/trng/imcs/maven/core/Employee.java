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
	private Date doj;
	
}
