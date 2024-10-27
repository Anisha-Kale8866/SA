package constructor;

public class Employee 
{
 // Employee  Details :- Name, Id, sal, Dept, gender.
	
	String emp_name;
	int emp_id;
	float emp_sal;
	String emp_dept;
	char gender;
	
    
	public void emp_info()
    {
    System.out.println("==========================");
    System.out.println("Employee name is "+emp_name);	
    System.out.println("Employee id is "+emp_id);
    System.out.println("Employee salary is "+emp_sal);
    System.out.println("Employee dept is "+emp_dept);
    System.out.println("Employee gender is "+gender);
    System.out.println("==========================");
}
	
}
