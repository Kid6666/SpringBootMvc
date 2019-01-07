package com.lejx.springboot.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;


public class MailSimple {
    private String from;
    private String to;
    private String sto;
    private String subject;
    private String context;
    private FileSystemResource file;

    @Override
    public String toString() {
        return "MailSimple{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", sto='" + sto + '\'' +
                ", subject='" + subject + '\'' +
                ", context='" + context + '\'' +
                ", file=" + file +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSto() {
        return sto;
    }

    public void setSto(String sto) {
        this.sto = sto;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public FileSystemResource getFile() {
        return file;
    }

    public void setFile(FileSystemResource file) {
        this.file = file;
    }
}
