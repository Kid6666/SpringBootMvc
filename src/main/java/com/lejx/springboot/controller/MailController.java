package com.lejx.springboot.controller;

import com.lejx.springboot.pojo.MailSimple;
import com.lejx.springboot.service.MailService;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.MessagingException;

@RestController
public class MailController {

    @Resource
    private MailService mailService;
    @RequestMapping("/send")
    public String sendMail() throws MessagingException {
        MailSimple mailSimple = new MailSimple();
        mailSimple.setFrom("1012468713@qq.com");
        mailSimple.setTo("le-jiaxin@163.com");
        mailSimple.setSubject("Test");
        mailSimple.setContext("Hello World!!");

        FileSystemResource file = new FileSystemResource("E:\\微信阿里云上云材料.ppt");
        mailSimple.setFile(file);

        mailService.sendAttachmentsMail(mailSimple);


        return "sucess";
    }
}
