/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6javamail.alisha;



/**
 *
 * @author asyla
 */


import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class SendingSimpleMail {
    public static void main(String[] args) {

        String to = "alishabohara417@gmail.com"; // who you are sending to
        String from = "csit22081031_alisha@achsnepal.edu.np"; // your Gmail
        String host = "smtp.gmail.com";

        // App Password instead of normal password
        final String username = "csit22081031_alisha@achsnepal.edu.np";
        final String appPassword = "jekondfmvkofwqhg"; // your 16-char app password

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, appPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Test Mail from Java");
            message.setText("Hello! This is a test mail using App Password.");

            Transport.send(message);

            System.out.println("Mail Sent Successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
