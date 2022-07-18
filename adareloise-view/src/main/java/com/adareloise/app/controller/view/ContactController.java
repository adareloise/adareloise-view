package com.adareloise.app.controller.view;

import javax.validation.Valid;
import javax.mail.MessagingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.adareloise.app.mail.MailService;
import com.adareloise.app.model.dto.Contact;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(value = "/contact")	
@RequiredArgsConstructor
@SessionAttributes("contact")
public class ContactController {

	private final MailService mailService;

	@GetMapping()
	public String contact(Model model) {
				
		model.addAttribute("title", "Contacto");
		model.addAttribute("contact", new Contact());
		
		return "contact";
	}
	
	@PostMapping()
	public String contact(@Valid Contact contact, BindingResult result, Model model, 
			RedirectAttributes flash, SessionStatus status) {
		
		if (result.hasErrors()) {
			model.addAttribute("title", "Contacto");
			return "contact";
		}
		
		model.addAttribute("name", contact.getName());
		
		try {
			this.mailService.sendMail("dutreras369@gmail.com", contact.getEmail(), "Bienvedido, gracias por contactarnos.", 
					"Hola " + contact.getEmail() + " este es tu mensaje: " 
					+ contact.getMessage() + " Estoy revisando el mensaje, saludos");
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		String mensajeFlash = ("Mensaje recibido correctamente!");
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		
		return  "redirect:/";
	
	}
}
