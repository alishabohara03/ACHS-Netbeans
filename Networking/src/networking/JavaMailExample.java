/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networking;

// Correct JavaMail imports
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;


/**
 *
 * @author asyla
 */
public class JavaMailExample {
    
    public static void main(String[] args) {

        // Your email credentials
        final String fromEmail = "alishabohara417@gmail.com";       // TODO: Replace with your email
        final String password = "Ankita9806445083@";           // TODO: Replace with your Gmail App Password

        // Recipient email address
        final String toEmail = "whybesonoisy@gmail.com";        // TODO: Replace with recipient's email

        // 1. Setup SMTP server properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");         // Gmail SMTP server
        props.put("mail.smtp.port", "587");                    // TLS Port
        props.put("mail.smtp.auth", "true");                   // Enable SMTP authentication
        props.put("mail.smtp.starttls.enable", "true");        // Enable STARTTLS for security

        // 2. Create a session with authentication
        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password); // Sender credentials
            }
        });

        try {
            // 3. Compose the message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));                 // Sender
            message.setRecipients(Message.RecipientType.TO,                  // Recipient
                    InternetAddress.parse(toEmail));
            message.setSubject("Test Email from JavaMail");                 // Subject
            message.setText("Hello! This is a test email sent using JavaMail API."); // Body

            // 4. Send the message
            Transport.send(message);

            System.out.println(" Email sent successfully!");

        } catch (MessagingException e) {
            System.out.println(" Error sending email:");
            e.printStackTrace();
        }
    }
}
