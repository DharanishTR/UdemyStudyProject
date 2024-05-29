package org.testSampleClass;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TransactionService {

    public static void main(String[] args) {
        System.out.println("Starting transaction..."+ priorWkTrans(LocalDate.parse("2024-05-20")) );
    }

    public static boolean priorWkTrans(LocalDate transactionDate) {
        LocalDate todaysDate = null;
        DayOfWeek weekDay = null;
        LocalDate weekEndDate = null;
        LocalDate transactionWeekEndDate = null;
        boolean isPreviousWeekTransaction = false;
        try{
            // Determine current week-ending date
            todaysDate = LocalDate.now();
            weekDay = todaysDate.getDayOfWeek();
            weekEndDate = weekDay == DayOfWeek.SUNDAY ? todaysDate :
                    todaysDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

            // Determine week-ending date for transaction
            weekDay = transactionDate.getDayOfWeek();
            transactionWeekEndDate = weekDay == DayOfWeek.SUNDAY ? transactionDate :
                    transactionDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

            // Check if transaction's week-ending date is prior to current week-ending date
            if (transactionWeekEndDate.isBefore(weekEndDate)) {
                isPreviousWeekTransaction = true;
            }


        } catch (Exception exception){
        }
        return isPreviousWeekTransaction;
    }
}
