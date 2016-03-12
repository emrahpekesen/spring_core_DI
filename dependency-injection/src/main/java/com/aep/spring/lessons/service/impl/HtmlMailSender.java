package com.aep.spring.lessons.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.aep.spring.lessons.model.Mail;
import com.aep.spring.lessons.service.MailSender;

@Primary
@Component
public class HtmlMailSender implements MailSender {

	@Override
	public String send(Mail mail) {
		mail.setMimeType("Html");
		return mail.toString();
	}

}
