package com.aep.spring.lessons.model;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@ToString
public class Mail {
   private String mimeType;
   private String to;
   private String subject;
   private String body;
}
