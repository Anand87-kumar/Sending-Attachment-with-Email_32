package com.anand.service;

import org.springframework.web.multipart.MultipartFile;

public interface EmailService {

	String sendEmail(String to, String[] cc, String subject2, String subject, MultipartFile[] files); 

}
