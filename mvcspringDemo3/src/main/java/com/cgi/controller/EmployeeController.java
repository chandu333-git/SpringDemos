package com.cgi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cgi.model.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/")
	public String dispIndex(Model model)
	{
		return "register";
	}
	
	
	@RequestMapping("/addEmployee")
	public String addEmployee(@RequestParam String code,@RequestParam String name,Model model )
	{
		
		Employee employee=new Employee();
		employee.setCode(code);
		employee.setName(name);
		 model.addAttribute("employeedetails", employee);
	    return "disp";
}


}
