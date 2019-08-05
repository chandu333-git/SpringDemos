package com.cgi;

import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(true) {
		     System.out.println("enter ur choice");
		    System.out.println("1) ADD EMPLOYEE");
		    System.out.println("2) DISPLAY EMPLOYEES");
		    System.out.println("3) DELETE EMPLOYEES");
		    System.out.println("4) SEARCH EMPLOYEES");
		    System.out.println("5) EXIT");
		    ch = sc.nextInt();
		    switch (ch) {
		    case 1:
		        Employee emp = new Employee();
		        System.out.println("enter code");
		        int code = sc.nextInt();
		        System.out.println("enter name");
		        String name = sc.next();
		        emp.setCode(code);
		        emp.setName(name);
		        empList.add(emp);
		        break;
		    case 2: for(Employee e:empList) {
		        System.out.println(e.getCode()+"\t"+e.getName()+"\t");
		    }
		    break;
		    case 3:
		    	System.out.println("Enter the code to be deleted");
		    	String code1=sc.next();
		    	Iterator<Employee> iter=empList.iterator();
		       while(iter.hasNext()) {
		    	   iter.remove();
		    	   break;
		    	   
		       }
		       
		
		    
		    break;
		    	   case 4:
		    		   System.out.println("Enter the code to be searched");
		                String searchCode=sc.next();
		                for(Employee emp1 : empList )
		                  {
		                	 if(emp1.getCode().equals(searchCode))
		                          {
		                               System.out.println(emp.getCode()+"\t"+emp.getName());
		                          }
		                  }
		                 break;
		       case 5  : System.exit(0);
		       }
		        }
		    }
		}
		   
