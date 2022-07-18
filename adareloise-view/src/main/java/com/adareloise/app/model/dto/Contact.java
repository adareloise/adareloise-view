package com.adareloise.app.model.dto;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Contact {
	
	@Size(min=3, message = "El nombre debe contener al menos 3 caracteres")
	String name;
	
	@Email(message = "Incluya un email valido")
	@NotEmpty(message = "El email no puede estar vacio.")
	String email;
	
	@Size(min=30, message = "El mensaje debe contener al menos 30 caracteres")
	String message;
	
	Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
}
