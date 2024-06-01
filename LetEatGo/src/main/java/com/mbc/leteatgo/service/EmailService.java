package com.mbc.leteatgo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmailService {
	
	@Autowired
	private JavaMailSender emailSender;
	
	public boolean sendSimpleMessage(String from, String to, String subject, String text) {
		
		boolean success = false;
		
		try {
		
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(from);
			message.setTo(to);
			message.setSubject(subject);
			message.setText(text);
			emailSender.send(message);
			
			success = true;
		} catch(Exception e) {
			
			log.error("SMTP 실패!");
		}// try
		
		
		return success;
	} 

}
