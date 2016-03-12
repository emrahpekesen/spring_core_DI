package com.aep.spring.lessons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aep.spring.lessons.model.Mail;
import com.aep.spring.lessons.service.MailSender;

@RestController
public class MailSenderController {
	private Mail mail;

	@Autowired
	public void setMail(Mail mail) {
		this.mail = mail;
		this.mail.setTo("emrahpekesen@gmail.com").setSubject("Reqource Annotation Kullanımı")
				.setBody("Bu Örnek Resource Annotation ını kullanarak Dependency Injecttion Yapmayı Anlatıyor..");
	}

	@Autowired
	// @Qualifier("html")
	@Qualifier("textMailSender") // Eğer Component sınıfında özel bir qualifier
									// tanımlamadıysanız, qualifier adını
									// sınıfın camelCase hlai olarak
									// tanımlamalısınız!
	MailSender mailSender;

	@RequestMapping("/sendMail")
	public String mailSend() {
		return mailSender.send(mail);
	}
}
