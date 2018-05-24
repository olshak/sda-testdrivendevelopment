package pl.sda.tdd;

public class NotificationService {
    private EmailService emailService;
    private PigeonService pigeonService;

    public NotificationService(EmailService emailService, PigeonService pigeonService) {
        this.emailService = emailService;
        this.pigeonService = pigeonService;
    }

    public void sendNotification() {
        if (emailService.isAvailable()) {
            emailService.sendEmail("sending email...");
        } else if (pigeonService.isAvailable()) {
            pigeonService.sendMessage("sending message...");
        } else {
            throw new IllegalStateException("Message services unavailable");
        }
    }
}
