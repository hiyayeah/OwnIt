package com.teamone.ownit.auth;

import java.util.Date;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SendMail {

    @Autowired
    private GoogleSMTPAuthenticator authenticator; // Gmail 인증기

    @Value("${mail.username}")
    private String mailUsername; // application.properties 에서 주입

    public boolean sendMail(String receiver, String title, String content) {
        boolean isSendSuccess = false;

        try {
            // 1. 메일 서버 기본 설정
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.ssl.protocols", "TLSv1.2");

            // 2. 세션 생성 (Authenticator 주입)
            Session mailSession = Session.getInstance(props, authenticator);

            // 3. 발신자 주소 결정 (NPE 방지)
            String fromEmail = null;
            if (authenticator != null && authenticator.getPasswordAuthentication() != null) {
                fromEmail = authenticator.getPasswordAuthentication().getUserName();
            }
            // authenticator에서 못 읽으면 properties 값 사용
            if (fromEmail == null || fromEmail.isEmpty()) {
                fromEmail = mailUsername;
            }
            if (fromEmail == null || fromEmail.isEmpty()) {
                throw new IllegalStateException("발신자 이메일이 설정되지 않았습니다. application.properties 값을 확인하세요.");
            }

            // 4. 메일 메시지 작성
            Message mailMessage = new MimeMessage(mailSession);
            mailMessage.setHeader("content-type", "text/html; charset=UTF-8");
            mailMessage.setFrom(new InternetAddress(fromEmail, "OwnIt"));
            mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
            mailMessage.setSubject(title);
            mailMessage.setContent(content, "text/html; charset=UTF-8");
            mailMessage.setSentDate(new Date());

            // 5. 메일 발송
            Transport.send(mailMessage);
            isSendSuccess = true;
            System.out.println("메일이 정상적으로 전송되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("SMTP 서버 설정 또는 서비스 문제 발생");
        }

        return isSendSuccess;
    }
}