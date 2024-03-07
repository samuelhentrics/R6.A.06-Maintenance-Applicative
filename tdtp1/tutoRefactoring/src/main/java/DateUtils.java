import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        // Refractor > Introduce Variable
        return isDateBetween(LocalDate.now(), startingDate, endingDate, );
    }

    static boolean isDateBetween(LocalDate date, LocalDate startingDate, LocalDate endingDate, boolean inclusive) {
        // code  à modifier pour tenir compte du parametre inclusive
        return (date.isAfter(startingDate)
                &&
                date.isBefore(endingDate)
        );
    }

    public static boolean isDateOutside(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return  (isDateBetween(date, startingDate, endingDate, ));
    }
}