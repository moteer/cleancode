package de.kodschul.cleancode.lambda;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda2 {

    // Better
    public List<String> getFullNamesOfAllAdultsBad(List<Person> persons) {

        List<String> collect = persons.stream().filter(p -> {
                    if (p.isMale()) {
                        return true;
                    }
                    LocalDate now = LocalDate.now();
                    Duration age = Duration.between(p.getBirthDate(), now);
                    Duration adult = Duration.of(18, ChronoUnit.YEARS);
                    if (age.compareTo(adult) > 0) {
                        return true;
                    }
                    return false;
                }).map(p -> p.getFirstName() + " " + p.getLastName())
                .collect(Collectors.toList());
        return collect;
    }

    // Better
    public List<String> getFullNamesOfAllAdults(List<Person> persons) {

        // Implementation details
        Predicate<Person> isMaleOrAdult = p -> {
            if (p.isMale()) {
                return true;
            }
            LocalDate now = LocalDate.now();
            return p.isAdult(now);
        };
        Function<Person, String> concatenateFirstAndLastName = p -> p.getFirstName() + " " + p.getLastName();

        return persons.stream()
                .filter(isMaleOrAdult).
                map(concatenateFirstAndLastName)
                .collect(Collectors.toList());
    }
}
