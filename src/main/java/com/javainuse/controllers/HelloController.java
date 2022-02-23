package com.javainuse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

	@RequestMapping("/hello.html")
	public ModelAndView hellomethod() {
		return new ModelAndView("hello");
	}

}
