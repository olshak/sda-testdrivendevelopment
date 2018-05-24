package pl.sda.tdd;

public interface EmailService {
    boolean isAvailable();
    void sendEmail(String message);
}
