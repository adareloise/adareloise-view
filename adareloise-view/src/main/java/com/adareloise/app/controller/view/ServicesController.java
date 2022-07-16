package com.adareloise.app.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/services")	
public class ServicesController {
	
	@GetMapping()
	public String services(Model model) {
				
		model.addAttribute("title", "Services");
		
		return "services";
	}

}
