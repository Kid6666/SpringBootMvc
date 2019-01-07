package com.lejx.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.lejx.springboot.pojo.MailSimple;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service("mailService")
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;
    @Override
    public void sendSimpleMail(MailSimple mailSimple) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mailSimple.getFrom());
        message.setTo(mailSimple.getTo());
        message.setSubject(mailSimple.getSubject());
        message.setText(mailSimple.getContext());
        mailSender.send(message);
    }
    public void sendAttachmentsMail(MailSimple mailSimple) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(mailSimple.getFrom());
        helper.setTo(mailSimple.getTo());
        helper.setSubject(mailSimple.getSubject());
        helper.setText(mailSimple.getContext());
        FileSystemResource file = mailSimple.getFile();
        helper.addAttachment(file.getFilename(),file);

        mailSender.send(message);
    }
}
