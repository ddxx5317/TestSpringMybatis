package com.ddxx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddxx.model.Student;
import com.ddxx.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class StudentController {

	@Autowired
	private UserServiceI userService;

	@RequestMapping("/{id}/showUser")
	public String showUser(@PathVariable String id, HttpServletRequest request) {
		Student u = userService.getStudentByNo(Integer.parseInt(id));
		request.setAttribute("user", u);
		return "showUser";
	}
}
