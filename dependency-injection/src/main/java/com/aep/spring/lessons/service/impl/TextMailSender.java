package com.aep.spring.lessons.service.impl;

import com.aep.spring.lessons.model.Mail;
import com.aep.spring.lessons.service.MailSender;

public class TextMailSender implements MailSender {

	@Override
	public String send(Mail mail) {
		mail.setMimeType("Text");
		return mail.toString();
	}

}
