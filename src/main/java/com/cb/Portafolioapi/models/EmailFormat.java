package com.cb.Portafolioapi.models;

public class EmailFormat {

    private String subject;
    private String toEmail;
    private String body;

    public EmailFormat() {
    }

    public EmailFormat(String subject, String toEmail, String body) {
        this.subject = subject;
        this.toEmail = toEmail;
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
