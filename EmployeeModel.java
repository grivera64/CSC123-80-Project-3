//package project3;

/* 
 * 
 * Name: grivera64
 * CSC123-80
 * Project 3
 * 
 * Program: EmployeeModel.java
 * Classes Required: Employee.java
 * -------------------------------------------
 * Purpose: To test the Employee class that is in the same package
 * 			(Because Package is commented out, this is the default package)
 * 
 */

public class EmployeeModel
{
	
	public static void main(String[] args)
	{
		
		//creating Employee objects and storing them in an iterable array
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		employees[1] = new Employee("Mark Jones", 39119, "IT", "Programmer");
		employees[2] = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		
		
		//iterate through each of the employee object's getXXX() methods
		int employeeCounter = 1;
		for (Employee e : employees)
		{
			System.out.printf("Employee #%d\n", employeeCounter++);
			System.out.printf("Name: %s\nID Number: %d\nDepartment: %s\nPosition: %s\n\n",
					e.getName(), e.getIdNumber(), e.getDepartment(), e.getPosition());
		}
		
		
		//iterate through each of the employee object's toString() methods
		System.out.printf("%-16s%-16s%-16s%s\n", 
				"Name:", "ID Number:", "Department", "Position");
		for (Employee e : employees)
		{
			System.out.printf("%s\n", e.toString());
		}
		//Program Termination
		
	}
	
}