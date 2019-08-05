package com.cgi.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.model.Employee;
import com.cgi.repo.EmployeeRepo;

public class Main {

	public static void main(String[] args) {
	    ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	    EmployeeRepo repo=(EmployeeRepo) context.getBean("emprepo");
	    Employee emp=(Employee) context.getBean("employee");
	    int ch;
	    Scanner scanner=new Scanner(System.in);
	    while(true)
	    {
	    	System.out.println("1) ADD EMPLOYEE");
			System.out.println("2) DELETE EMPLOYEE");
			System.out.println("3)UPDATE EMPLOYEE");
			System.out.println("4) Display all employees");
			System.out.println("5) EXIT");
			System.out.println("Enter your choice");
			ch=scanner.nextInt();
			      
			switch(ch)
			{
			case 1    : System.out.println("Enter the code");
	                    String code=scanner.next();
	                    System.out.println("Enter the name");
	                    String name=scanner.next();
	                     emp.setCode(code);
	                     emp.setName(name);
	                     boolean b=repo.addEmployee(emp);
	                     if(b==true) {
	             	    	System.out.println("Records are added");
	                     }
	                     else
	                     {
	                    	 System.out.println("Records are not added");
	                     }
	                     break;
			case 2 :     System.out.println("Enter the code to be deleted");
                  String code1=scanner.next();
                  boolean deleted=repo.deleteEmployee(code1);
                 if(deleted)
                {
           	     System.out.println("Deleted!!!!");
               }
              else
                {
           	   System.out.println("Not deleted!!!!");
                  }
                   break;
			case 3:
				System.out.println("Enter code to be updated");
				String code2=scanner.next();
                System.out.println("Enter the new name");
                String name1=scanner.next();
                boolean updated=repo.updateEmployee(code2,name1);
                if(updated)
                {
                    System.out.println("Record succesfully updated");
                }
                else
                {
                    System.out.println("not updated");
                }
                break;
                case 4: List<Employee> emplist=repo.displayEmployees();
                for (Employee e:emplist) {
                	System.out.println(e.getCode()+ "/t" +e.getName());
                }
                
			case 5: System.exit(0);

	    }
			
	}

	    }}
