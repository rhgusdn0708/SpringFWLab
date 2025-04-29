package mylab.notification.di.annot.config;

import mylab.notification.di.annot.NotificationService;
import mylab.notification.di.xml.EmailNotificationService;
import mylab.notification.di.xml.SmsNotificationService;
import mylab.notification.di.xml.NotificationManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {

    @Bean
    public NotificationService emailNotificationService() {
        return new EmailNotificationService("smtp.gmail.com", 587);
    }

    @Bean
    public NotificationService smsNotificationService() {
        return new SmsNotificationService("SK");
    }

    @Bean
    public NotificationManager notificationManager() {
        return new NotificationManager(emailNotificationService(), smsNotificationService());
    }
}