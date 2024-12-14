package com.banking.application.service;

import ch.qos.logback.core.CoreConstants;
import com.banking.application.dto.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
    JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    public String sender;

    @Override
    public void sendMailAlert(EmailDetails emailDetails) {
        try{
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo(emailDetails.getRecipient());
            mailMessage.setSubject("TESTING FIRST MAIL SENDING");
            mailMessage.setText("Congratulations!" +" " +emailDetails.getAttachment() + "FINALLY SENDING YOU THE MAIL VIA SpringBOOT. Enjoy!!!..." );

            javaMailSender.send(mailMessage);
            System.out.println("MAIl SENT SUCCESSFULLY"+" "+emailDetails.getAttachment());
        }catch (MailException e){
            e.getStackTrace();
        }
    }
}
