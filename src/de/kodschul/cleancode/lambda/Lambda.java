package de.kodschul.cleancode.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

    public void doLambdaMagicBad(List<String> names) {
        List<String> filtered = names.stream()
                .filter(s -> s.length() > 3 && s.startsWith("C"))
                .collect(Collectors.toList());

    }

    public void doLambdaMagicBetter(List<String> names) {
        List<String> validNames = names.stream()
                .filter(this::isValidName)
                .collect(Collectors.toList());

    }

    private boolean isValidName(String name) {
        return name.length() > 3 && name.startsWith("A");   // ...
    }

}
