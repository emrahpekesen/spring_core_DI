package com.aep.spring.lessons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.spring.lessons.model.Mail;
import com.aep.spring.lessons.service.MailSender;

@RestController
public class MailSenderController {
	private Mail mail;
	
	@Value("${mail.to}")
	private String to;
	@Value("${mail.subject}")
	private String subject;
	@Value("${mail.body}")
	private String body;
	

	@Autowired
	public void setMail(Mail mail) {
		this.mail = mail;
		this.mail.setTo(to).setSubject(subject)
				.setBody(body);
	}

	@Autowired
	@Qualifier("htmlMail")
	//@Qualifier("textMailSender") // Qualifier ,Configuration sınıfında tanıladığınız methodun adı olmalı
	MailSender mailSender;

	@RequestMapping("/sendMail")
	public String mailSend() {
		return mailSender.send(mail);
	}
}
