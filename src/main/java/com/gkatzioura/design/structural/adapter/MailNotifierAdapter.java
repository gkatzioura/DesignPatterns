package com.gkatzioura.design.structural.adapter;

import java.util.List;

public class MailNotifierAdapter implements Notifier {

    private static final String NOTIFICATION_TITLE = "System notification";

    public void notify(List<String> recipients, String message) {

        MailSender mailSender = new MailSender(NOTIFICATION_TITLE,message,recipients);
        mailSender.sendMessage();
    }

}
