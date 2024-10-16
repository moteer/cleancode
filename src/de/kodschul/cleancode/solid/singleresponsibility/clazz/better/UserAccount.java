package de.kodschul.cleancode.solid.singleresponsibility.clazz.better;

public class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        // Keine Protokollierungslogik hier
    }
}

