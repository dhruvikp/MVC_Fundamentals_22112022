package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

	// 1. Handle Request
	@GetMapping("/greet")
	public String greet(Model model, @RequestParam("name") String name) {
		
		// STEP 2: DO Business logic
		
		// STEP 3: Populate Model
		//String name = "Dhruvik11";
		model.addAttribute("name", name);

		return "hello1";
	}
}
