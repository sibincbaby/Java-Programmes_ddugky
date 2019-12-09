package com.face.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
@RequestMapping ("/")
public String home() {
	return "home";
}
@RequestMapping ("/register")
public String register() {
	return "register";
}
@RequestMapping ("/login")
public String login() {
	return "login";
}

@RequestMapping (value="/welcome")
public ModelAndView welcome(HttpServletRequest request,HttpServletResponse response) {
	
	String uname = request.getParameter("uname");
	ModelAndView mv = new ModelAndView();
	mv.setViewName("welcome");
	mv.addObject("user",uname);
	return mv;
}

	
}
