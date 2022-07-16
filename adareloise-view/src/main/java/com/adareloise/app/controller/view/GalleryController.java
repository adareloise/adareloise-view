package com.adareloise.app.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/gallery")	
public class GalleryController {
	
	@GetMapping()
	public String documents(Model model) {
				
		model.addAttribute("title", "Gallery");
		
		return "gallery";
	}

}
