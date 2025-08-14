package com.teamone.ownit.auth;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoogleSMTPAuthenticator extends Authenticator {
	
    @Value("${mail.username}")
    private String username;

    @Value("${mail.password}")
    private String password;

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }
}