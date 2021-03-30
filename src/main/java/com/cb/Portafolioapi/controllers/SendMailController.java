package com.cb.Portafolioapi.controllers;

import com.cb.Portafolioapi.models.EmailFormat;
import com.cb.Portafolioapi.security.services.EmailConfig.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/mail")
public class SendMailController {

    @Autowired
    private SenderService senderService;

    @PostMapping
    public void sendMail(@RequestBody EmailFormat emailFormat){
        senderService.sendSimpleEmail(emailFormat);
    }
}
