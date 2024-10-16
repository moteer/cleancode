package de.kodschul.cleancode.cohesion.bad;

import java.util.List;

/***
 * Enhance cohesion of this class
 */
class UserManager {
    private List<User> users;
    public Report report;

    UserManager(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void generateReport() {
        // This method handles report generation, unrelated to user management
        report = new Report(users);
        report.setDescription("This report shows you ...");
        System.out.println(report.toString());
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
