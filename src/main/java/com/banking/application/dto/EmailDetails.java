package com.banking.application.dto;

import lombok.Builder;

@Builder
public class EmailDetails {

    private String recipient;

    private String messageBody;
    private String subject;

    private String attachment;

    public EmailDetails(String recipient,String attachment) {
        this.recipient = recipient;
        this.attachment=attachment;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}
