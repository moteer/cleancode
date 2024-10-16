package de.kodschul.cleancode.solid.singleresponsibility.method.better;

public class EmailService {
    public void sendEmailWithReport(String email, String report) {
        // Logik zum Senden des Berichts per E-Mail
        System.out.println("Sending report to " + email + "..." + report);
    }
}
