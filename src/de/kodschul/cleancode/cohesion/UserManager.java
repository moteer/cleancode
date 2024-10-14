package de.kodschul.cleancode.cohesion;

import java.util.List;

/***
 * Erhöhe die Kohösion dieser Klasse
 */
class UserManager {
    private List<User> users;

    UserManager(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void generateReport() {
        // This method handles report generation, unrelated to user management
        System.out.println("Generating user report...");
        // Logic to generate the report
    }

    public void sendEmailToUser(User user, String message) {
        // email sending logic
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
    }

    public void logUserActivity(User user) {
        // Logic to log user activity
        System.out.println("Logging activity for user: " + user.getName());
    }
}
