package com.mbc.leteatgo.config;

import java.util.Properties;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class EmailConfig {
	
//	public JavaMailSender getJavaMailSender() {
//		
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		
//		mailSender.setHost("smtp.naver.com");
//		mailSender.setPort(587);
//		
//		mailSender.setUsername("네이버계정");
//		mailSender.setPassword("네이버계정비밀번호");
//		
//		Properties props = mailSender.getJavaMailProperties();
//		props.put("mail.transport.protocol", "smtp");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.starttls.enable", "true");
//		props.put("mail.debug", "true");
//		
//		
//		return mailSender;
//	}
	
	public JavaMailSender getJavaMailSender() {
		
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		
		mailSender.setUsername("thisOneIsForteamChoco@gmail.com");
		mailSender.setPassword("jzte ukkm liwp ccha");
		
		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.starttls.enable", "true");
		props.put("mail.debug", "true");
		
		
		return mailSender;
	}

}
