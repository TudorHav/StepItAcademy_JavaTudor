package bean;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class Employee 
{
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	private String gender;
	private String phoneNumber;
	
	
	public Employee(String firstName, String lastName, int year, int month, int day, String gender, String phoneNumber)
	{
			
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = LocalDate.of(year, month, day);
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder ();
		
		sb.append("Name: ").append(firstName).append(" ").append(lastName).append("\n").
		append("Date of Birth: ").append(dateOfBirth.toString()).append("\n").
		append("Gender: ").append(gender).append("\n").
		append("Phone Number: ").append(phoneNumber);
		
		return sb.toString();
	}
}
