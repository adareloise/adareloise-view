package com.adareloise.app.mail;

import javax.mail.MessagingException;

public interface MailService {

	void sendMail(String from, String to, String subject, String text) throws MessagingException;
	
}
