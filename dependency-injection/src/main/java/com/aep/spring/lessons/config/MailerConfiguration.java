package com.aep.spring.lessons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aep.spring.lessons.model.Mail;
import com.aep.spring.lessons.service.MailSender;
import com.aep.spring.lessons.service.impl.HtmlMailSender;
import com.aep.spring.lessons.service.impl.TextMailSender;

@Configuration
public class MailerConfiguration {

	@Bean
	public Mail mail(){
		return new Mail();
	}
	
	@Bean
	public MailSender htmlMail()
	{
		return new HtmlMailSender();
	}
	
	@Bean
	public MailSender textMailSender(){
		return new TextMailSender();
	}
}
