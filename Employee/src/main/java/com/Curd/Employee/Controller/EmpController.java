package com.Curd.Employee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmpController {
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}

}
