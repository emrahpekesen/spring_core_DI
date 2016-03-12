package com.aep.spring.lessons.service.impl;

import org.springframework.stereotype.Component;

import com.aep.spring.lessons.model.Mail;
import com.aep.spring.lessons.service.MailSender;

@Component
public class TextMailSender implements MailSender {

	@Override
	public String send(Mail mail) {
		mail.setMimeType("Text");
		return mail.toString();
	}

}
