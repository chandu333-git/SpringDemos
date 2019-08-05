package com.cgi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String message(Model model)
	
    {
		model.addAttribute("message", "Stephanie Poetri");
        return "hello";
	}
}
