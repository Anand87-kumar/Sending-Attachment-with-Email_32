package com.anand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.anand.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailSendController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(
            @RequestParam(value = "file", required = false) MultipartFile[] files,
            @RequestParam String to,
            @RequestParam(required = false) String[] cc,
            @RequestParam String subject,
            @RequestParam String body) {
        return emailService.sendEmail(to, cc, subject, body, files);
    }
}

