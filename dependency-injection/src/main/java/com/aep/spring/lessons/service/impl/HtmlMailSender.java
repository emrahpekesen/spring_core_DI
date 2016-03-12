package com.aep.spring.lessons.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aep.spring.lessons.model.Mail;
import com.aep.spring.lessons.service.MailSender;

@Qualifier("html")
@Component
public class HtmlMailSender implements MailSender {

	@Override
	public String send(Mail mail) {
		mail.setMimeType("Html");
		return mail.toString();
	}

}
