package com.adareloise.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String list(Model model) {
				
		model.addAttribute("title", "Home");
		
		return "index";
	}
	
	@PostMapping("/contact")
	public String contact(Model model) {
				
		model.addAttribute("title", "Contacto");
		
		return "index";
	}
}
