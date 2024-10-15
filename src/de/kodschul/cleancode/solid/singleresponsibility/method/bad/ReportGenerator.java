package de.kodschul.cleancode.solid.singleresponsibility.method.bad;

import java.util.List;

public class ReportGenerator {
    public void generateReport(List<Employee> employees) {
        // Logik zur Generierung des Berichts
        StringBuilder report = new StringBuilder();
        report.append("Employee Report");
        report.append("-----------------");
        for (Employee employee : employees) {
            report.append("Name: " + employee.getName() + ", Salary: " + employee.getSalary() + " ");
        }

        // Speichern des Berichts in einer Datei
        saveReportToFile(report.toString());

        // Senden des Berichts per E-Mail
        sendEmailWithReport("admin@example.com", report.toString());
    }

    private void saveReportToFile(String report) {
        // Logik zum Speichern des Berichts in einer Datei
        System.out.println("Saving report to file...");
    }

    private void sendEmailWithReport(String email, String report) {
        // Logik zum Senden des Berichts per E-Mail
        System.out.println("Sending report to " + email + "..." + report);
    }
}
