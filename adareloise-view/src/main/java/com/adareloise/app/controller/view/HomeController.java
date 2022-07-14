package com.adareloise.app.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.adareloise.app.model.dto.Contact;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String list(Model model) {
				
		model.addAttribute("title", "Home");
		model.addAttribute("contact", new Contact());
		
		return "index";
	}
	
	@PostMapping("/contact")
	public String contact(Model model, @ModelAttribute Contact contact) {
		
		model.addAttribute("name", contact.getName());
		
		return  "redirect:/";
	}
}
