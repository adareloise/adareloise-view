package com.adareloise.app.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adareloise.app.model.dto.Contact;

@Controller
@RequestMapping(value = "/documents")	
public class DocumentsController {
	
	@GetMapping()
	public String documents(Model model) {
				
		model.addAttribute("title", "Documents");
		model.addAttribute("contact", new Contact());
		
		return "documents";
	}

}
