package com.MajorProject.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping({"","/"})
	public String getDashBoard()
	{
		return "dashboard";
	}
	@GetMapping({ "/add"})
	public String addStudent()
	{
		return "addStudent";
	}

}