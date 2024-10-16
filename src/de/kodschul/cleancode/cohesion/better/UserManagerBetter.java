package de.kodschul.cleancode.cohesion.better;

import de.kodschul.cleancode.cohesion.bad.User;

import java.util.ArrayList;
import java.util.List;

class UserManagerBetter {
        private List<User> users = new ArrayList<>();

        public void addUser(User user) {
            users.add(user);
        }

        public void logUserActivity(User user) {
            // Logic to log user activity
            System.out.println("Logging activity for user: " + user.getName());
        }
    }

    class ReportGenerator {
        public void generateUserReport(List<User> users) {
            // Logic to generate the user report
            System.out.println("Generating user report...");
        }
    }

    class EmailService {
        public void sendEmail(User user, String message) {
            // Logic to send an email
            System.out.println("Sending email to " + user.getEmail() + ": " + message);
        }
    }


