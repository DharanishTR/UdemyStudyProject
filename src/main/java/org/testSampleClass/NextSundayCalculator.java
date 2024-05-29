
package org.testSampleClass;

/**
 * @author : tcs
 */
import java.time.LocalDate;
import java.time.DayOfWeek;

public class NextSundayCalculator {

    public static LocalDate getNextSunday(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SUNDAY) {
            return date;
        } else {
            System.out.println("DayOfWeek.SUNDAY.getValue() "+DayOfWeek.SUNDAY.getValue());
            System.out.println("dayOfWeek.getValue() "+dayOfWeek.getValue());
            int daysUntilSunday = DayOfWeek.SUNDAY.getValue() - dayOfWeek.getValue();
            return date.plusDays(daysUntilSunday);
        }
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2024-05-27");
        //LocalDate date = LocalDate.of(parseDate); // Example date

        LocalDate nextSunday = getNextSunday(date);
        System.out.println("Next Sunday after " + date + " is " + nextSunday);
    }
}
