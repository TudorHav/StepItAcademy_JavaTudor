package main;

import java.time.LocalDate;
import java.util.HashMap;

import bean.Department;
import bean.Employee;

public class HR 
{
	int numberOfEmployees;
	private Employee employee[] = new Employee[500];
	private Department department;
	HashMap departmentPosition = new HashMap();
	private LocalDate employmentDate;
	
	public void hire (Employee employee, Department department, int year, int month, int day)
	{
		
		this.employee[numberOfEmployees++] = employee;
		departmentPosition.put(employee, department);
		this.employmentDate = LocalDate.of(year, month, day);
		
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Employee's \n");
		
		for(int i=0;i<numberOfEmployees;i++)
		{
			sb.append( employee[i] ).append("\n").
			//TODO GetKey method
			append(departmentPosition.get(employee[i])).append("\n").
			append("Started on : ").append(employmentDate).append("\n\n");
		}
		
		return sb.toString();
	}
	
}
