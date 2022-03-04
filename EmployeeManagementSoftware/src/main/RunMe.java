package main;

import java.util.Date;
import java.util.GregorianCalendar;

import bean.Department;
import bean.Employee;

public class RunMe {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Employee e1 = null;
		Employee e2 = null;
		Department d1 = null;
		
		try 
		{
			e1 = new Employee ("Andrei","Tudor", 2000,10,3, "male", "0011334");
			d1 = new Department ("QA");
			e2 = new Employee ("Andrei","Tudor",1995,12,5,"female","99192313");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		HR hr = new HR();
		
		hr.hire(e1, d1,2001,2,1);
		hr.hire(e2, d1,2005,6,1);
		
		System.out.print(hr);
		

	}

}
