package com.adareloise.app.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adareloise.app.model.dto.Contact;

@Controller
@RequestMapping(value = "/contact")	
public class ContactController {
	
	@GetMapping()
	public String contact(Model model) {
				
		model.addAttribute("title", "Contacto");
		model.addAttribute("contact", new Contact());
		
		return "contact";
	}
	
	@PostMapping("/contact")
	public String contact(Model model, @ModelAttribute Contact contact) {
		
		model.addAttribute("name", contact.getName());
		
		return  "redirect:/";
	
	}
}
