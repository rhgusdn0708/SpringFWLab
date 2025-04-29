package mylab.notification.di.xml;

import mylab.notification.di.annot.NotificationService;

public class NotificationManager {
    private NotificationService emailService;
    private NotificationService smsService;

    public NotificationManager(NotificationService emailService, NotificationService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void sendNotificationByEmail(String message) {
        emailService.sendNotification(message);
    }

    public void sendNotificationBySms(String message) {
        smsService.sendNotification(message);
    }

    public NotificationService getEmailService() {
        return emailService;
    }

    public NotificationService getSmsService() {
        return smsService;
    }
}