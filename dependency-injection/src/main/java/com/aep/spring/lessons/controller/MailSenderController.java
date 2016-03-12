package com.aep.spring.lessons.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.spring.lessons.model.Mail;
import com.aep.spring.lessons.service.MailSender;

@RestController
public class MailSenderController {
	private Mail mail;

	@Resource
	public void setMail(Mail mail) {
		this.mail = mail;
		this.mail.setTo("emrahpekesen@gmail.com").setSubject("Reqource Annotation Kullanımı")
				.setBody("Bu Örnek Resource Annotation ını kullanarak Dependency Injecttion Yapmayı Anlatıyor..");
	}

	// Not : Aşağıdaki name argümanlı Resource Annotationlarını kullanmak
	// istediğinizde HtmlMailSender sınıfındaki Primary Annotation ını kaldırın!

	// @Resource(name="htmlMailSender")
	// @Resource(name = "textMailSender")
	@Resource
	MailSender mailSender;

	@RequestMapping("/sendMail")
	public String mailSend() {
		return mailSender.send(mail);
	}
}
