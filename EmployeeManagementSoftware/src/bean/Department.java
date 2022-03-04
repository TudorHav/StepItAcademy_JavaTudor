package bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Department 
{
	String name;
	Employee employee;
	HashMap departments = new HashMap();

	public Department(String name)
	{
		this.name = name;
	}
	
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Department: ").append(name);
		
		return sb.toString();
	}
}
