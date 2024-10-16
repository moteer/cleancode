package de.kodschul.cleancode.solid.singleresponsibility.method.better;

import de.kodschul.cleancode.solid.singleresponsibility.method.bad.Employee;

import java.util.List;

public class ReportGenerator {
    public void generateReport(List<Employee> employees) {
        // Logik zur Generierung des Berichts  ...
        StringBuilder report = new StringBuilder();
        report.append("Employee Report");
                report.append("-----------------");
        for (Employee employee : employees) {
            report.append("Name: " + employee.getName() + ", Salary: " + employee.getSalary() + " ");
        }

        // Bericht an die ReportSaver-Klasse übergeben
        ReportSaver saver = new ReportSaver();
        saver.saveReportToFile(report.toString());

        // Bericht an die EmailService-Klasse übergeben
        EmailService emailService = new EmailService();
        emailService.sendEmailWithReport("admin@example.com", report.toString());
    }
}

