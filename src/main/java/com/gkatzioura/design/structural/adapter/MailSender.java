package com.gkatzioura.design.structural.adapter;

import java.util.List;

public class MailSender {

    private String title;
    private String message;
    private List<String> recipients;

    public MailSender(String title, String message, List<String> recipients) {
        this.title = title;
        this.message = message;
        this.recipients = recipients;
    }

    public void sendMessage() {

    }

    public void sendHtmlMessage(String htmlTemplate) {

    }


}
