package de.kodschul.cleancode.kiss;

public class StringUtil {
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseWithWhitespace(String input) {
        StringBuilder reversed = new StringBuilder();
        boolean inWhitespace = false;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ') {
                if (!inWhitespace) {
                    reversed.append(' ');
                    inWhitespace = true;
                }
            } else {
                reversed.append(input.charAt(i));
                inWhitespace = false;
            }
        }
        return reversed.toString().trim();
    }


    public static String reverseBetter(String input) {
        return new StringBuilder(input).reverse().toString(); // Simple and effective reversal
    }

    public static String reverseWithWhitespaceBetter(String input) {
        return reverse(input).replaceAll("\s+", " ").trim(); // Reverses and handles whitespace in a simple way
    }
}
