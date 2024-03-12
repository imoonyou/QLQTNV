package com.example.lesson1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoursesController {
	
	@RequestMapping("/Courses")
	
	public String Courses() {
		System.out.print("Hello World");
		return "course.jsp";
	}
}