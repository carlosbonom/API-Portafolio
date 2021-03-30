package com.cb.Portafolioapi.security.services.EmailConfig;

import com.cb.Portafolioapi.models.EmailFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String email;

    public void sendSimpleEmail(EmailFormat emailFormat){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(email);
        message.setTo(emailFormat.getToEmail());
        message.setText(emailFormat.getBody());
        message.setSubject(emailFormat.getSubject());

        mailSender.send(message);
        System.out.println("Mail Send...");
    }
}
