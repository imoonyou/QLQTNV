

package com.example.lesson1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CoursesController {
	
	@RequestMapping("/courses")
	
	public String Courses(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String cname = req.getParameter("cname");
		//System.out.print("Hello " + cname);
		session.setAttribute("cname", cname);
		return "course.jsp";
	}
}
