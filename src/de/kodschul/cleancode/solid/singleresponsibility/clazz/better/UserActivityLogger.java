package de.kodschul.cleancode.solid.singleresponsibility.clazz.better;

public class UserActivityLogger {
    public void logPasswordChange(String username) {
        // Logik zur Protokollierung der Passwortänderung
        System.out.println("Password changed for user: " + username);
    }
}
