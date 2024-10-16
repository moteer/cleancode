package de.kodschul.cleancode.cohesion.bad;

import java.util.List;

public class Report {
    private String description;

    public Report(List<User> users) {

    }

    public void setDescription(String description) {

        this.description = description;
    }
}
