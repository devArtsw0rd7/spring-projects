package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new controller method to read form data and add data
	// to the model
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		// convert that data to ALL CAPS
		theName = theName.toUpperCase();
		// create the message
		String result = "YO! " + theName;
		// add that message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// new handler method using @Requestparam binding
	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName") String theName, Model model) {
				
		// convert that data to ALL CAPS
		theName = theName.toUpperCase();
		// create the message
		String result = "Hey friend from v3! " + theName;
		// add that message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
