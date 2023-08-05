package com.takeo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.model.User;

@RestController
public class RegistrationController {

	@RequestMapping("/")
	public String loadForm() {

		return "register.html";

	}
	
	//@RequestMapping("/insert")
	@PostMapping("/insert")
	public String handleForm(@ModelAttribute("user") User user,Model model)
	{
		model.addAttribute("user",user);
		
		return "user-data.html";
		
	}

}
