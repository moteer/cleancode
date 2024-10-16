package de.kodschul.cleancode.lambda;

import java.time.LocalDate;

public class Person {
    private boolean male;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public boolean isMale() {
        return male;
    }

    public boolean isAdult(LocalDate now) {
        // something with age ...
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean getGender() {
        return male;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
