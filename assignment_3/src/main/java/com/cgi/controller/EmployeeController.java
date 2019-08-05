package com.cgi.controller;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cgi.model.Employee;
import com.cgi.repository.EmployeeRepo;

@Controller
public class EmployeeController {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	   EmployeeRepo emprepo = (EmployeeRepo) context.getBean("emprepo");
	   @RequestMapping("/")
	   public String addEmployee(Model model) {
	       List<Employee> empList = emprepo.displayEmployees();
	       model.addAttribute("employeelist", empList);
	       return "index";
	   }
	   @RequestMapping("/saveEmployee")
	   public String saveEmployee(@RequestParam String code, @RequestParam String name,Model model) {
	       Employee emp = new Employee();
	       emp.setCode(code);
	       emp.setName(name);
	       model.addAttribute("employeelist", emprepo.displayEmployees());
	       emprepo.addEmployee(emp);
	       return "index";
	   }
	   
	   }

