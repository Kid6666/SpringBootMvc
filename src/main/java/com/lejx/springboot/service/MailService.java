package com.lejx.springboot.service;

import com.lejx.springboot.pojo.MailSimple;

import javax.mail.MessagingException;

public interface MailService {

    public void sendSimpleMail(MailSimple mailSimple);

    public void sendAttachmentsMail(MailSimple mailSimple) throws MessagingException;

}
