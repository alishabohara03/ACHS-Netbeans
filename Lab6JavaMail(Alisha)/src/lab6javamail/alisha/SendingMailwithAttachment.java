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
import jakarta.activation.*;
import java.util.Properties;
import java.io.File;

public class SendingMailwithAttachment {
    public static void main(String[] args) {

        String to = "alishabohara417@gmail.com";   // recipient email
        String from = "csit22081031_alisha@achsnepal.edu.np";   // your Gmail
        final String username = "csit22081031_alisha@achsnepal.edu.np";
        final String appPassword = "jekondfmvkofwqhg"; // your 16-char app password

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, appPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Mail with Attachment from Java");

            // Create message body part
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hello! This mail has an attachment.");

            // Create multipart
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Attachment
            messageBodyPart = new MimeBodyPart();
            String filename = "C:\\Users\\user\\Documents\\sample.txt"; // path to file
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(new File(filename).getName());
            multipart.addBodyPart(messageBodyPart);

            // Set content
            message.setContent(multipart);

            Transport.send(message);
            System.out.println("Mail Sent with Attachment Successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

