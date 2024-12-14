package com.banking.application.service;

import com.banking.application.dto.EmailDetails;

public interface EmailService {

    void sendMailAlert(EmailDetails emailDetails);
}
