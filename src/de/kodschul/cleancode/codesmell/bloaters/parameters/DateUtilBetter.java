package de.kodschul.cleancode.codesmell.bloaters.parameters;


class DateUtilBetter {
    boolean isAfter(Date date1, Date date2) {
        // implementation
        return true;
    }

    int differenceInDays(Date date1, Date date2) {
        // implementation
        return 0;
    }

    // other date methods
}

class Date {
    int year;
    int month;
    int day;
}
