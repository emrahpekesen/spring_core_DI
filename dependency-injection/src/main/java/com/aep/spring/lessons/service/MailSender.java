package com.aep.spring.lessons.service;

import com.aep.spring.lessons.model.Mail;

public interface MailSender {
   String send(Mail mail);
}
