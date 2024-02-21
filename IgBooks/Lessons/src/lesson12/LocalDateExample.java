package lesson12;

import java.time.LocalDate;

import static java.lang.System.out;
import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate now, bDate, nowPlusMonth, nextTues;
        now = LocalDate.now();
        out.println("now " + now);
        bDate = LocalDate.of(1995, 5, 23);
        out.println("Java bday: " + bDate);
        out.println("java bday in the past? " + bDate.isBefore(now));
        out.println("Is Java's Bday in a leap year? " + bDate.isLeapYear());
        out.println("Java's Bday day of the week: " + bDate.getDayOfWeek());
        nowPlusMonth = now.plusMonths(1);
        System.out.println("Now: " + nowPlusMonth);
        nextTues = now.with(next(TUESDAY));
        out.println("Next Tuesday's date: " + nextTues);


    }

}
