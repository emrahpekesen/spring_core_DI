package com.aep.spring.lessons.service;

import org.springframework.stereotype.Component;

import com.aep.spring.lessons.model.Mail;

@Component
public interface MailSender {
   String send(Mail mail);
}
