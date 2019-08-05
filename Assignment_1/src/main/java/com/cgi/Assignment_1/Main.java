package com.cgi.Assignment_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



   public class Main {
	   public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			EmployeeRepository repository=new EmployeeRepository();
			int choice;
			while(true)
			{
				System.out.println("1) ADD EMPLOYEE");
				System.out.println("2) DELETE EMPLOYEE");
				System.out.println("3) DISPLAY ALL EMPLOYEES");
				System.out.println("4) EXIT");
				System.out.println("Enter your choice");
				choice=scanner.nextInt();
			switch(choice)
			{
			case 1    :  Employee emp=new Employee();
				         System.out.println("Enter the code");
			             emp.setCode(scanner.next());
	                     System.out.println("Enter the name");
			             emp.setName(scanner.next());
			             repository.addEmployee(emp);
			             break;
			case 2 :     System.out.println("Enter the code to be deleted");
			             String code=scanner.next();
			             boolean deleted=repository.delete(code);
		                 if(deleted)
		                 {
		                	 System.out.println("Deleted!!!!");
		                 }
		                 else
		                 {
		                	 System.out.println("Not deleted!!!!");
		                 }
		                 break;
			case 3 :    List<Employee> empList=repository.getEmployees();
		                for(Employee e : empList)
		                {
		                	System.out.println(e.getCode()+"\t"+e.getName());
		                }
		                break;
			case 4 : System.exit(0);           
			}
			}
			
			
	   }}