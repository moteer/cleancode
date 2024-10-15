package de.kodschul.cleancode.solid.singleresponsibility.clazz.bad;

public class UserAccountBad {
    private String username;
    private String password;

    public UserAccountBad(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        // Logik zur Protokollierung der Passwortänderung
        logPasswordChange(username, newPassword);
    }

    public void logPasswordChange(String username, String newPassword) {
        // Logik zur Protokollierung der Passwortänderung
        System.out.println("Password changed for user: " + username);
    }
}
