//package project3;

/*
 * 
 * Name: grivera64
 * CSC123-80
 * Project 3
 * 
 * Driver Class (Main Program): EmployeeModel.java
 * Current Class: Employee.java
 * ------------------------------------------
 * Purpose: To store the name, id, department, and position of employees
 * 			as well as to modify them
 * 
 */

public class Employee
{
	
	//private fields
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	//empty constructor
	public Employee()
	{
		this(" ", 0, " ", " ");
	}
	
	//override of constructor with different number of arguments
	public Employee(String name, int idNumber, String department, String position)
	{
		
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
		
	}
	
	//override of constructor with different number of arguments
	public Employee(String name, int idNumber)
	{
		this(name, idNumber, " ", " ");
	}
	
	//setXXX() methods set the XXX field to the value in the argument
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setIdNumber(int idNumber)
	{
		this.idNumber = idNumber;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public void setPosition(String position)
	{
		this.position = position;
	}
	
	//getXXX() methods return the value of the XXX field to where called
	public String getName()
	{
		return this.name;
	}
	
	public int getIdNumber()
	{
		return this.idNumber;
	}
	
	public String getDepartment()
	{
		return this.department;
	}
	
	public String getPosition()
	{
		return this.position;
	}
	
	//ToString method that is overridden
	//from the inherited parent class Object's toString() method
	//@Override
	public String toString()
	{
		return String.format("%-16s%-16d%-16s%s", 
				this.name, this.idNumber, this.department, this.position);
	}
	
}