package com.adareloise.app.mail;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MailServiceImpl implements MailService{
	
	private final JavaMailSender javaMailSender;
	
	@Override
	public void sendMail(String from, String to, String subject, String text) throws MessagingException {

		MimeMessage message = javaMailSender.createMimeMessage();
		
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setTo(to);
		helper.setFrom(from);
		helper.setSubject(subject);
		helper.setText(text, true);
		javaMailSender.send(message);

	}
}
