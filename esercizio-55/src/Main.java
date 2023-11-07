import java.time.OffsetDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(dataYear(data));
        System.out.println(month(data));
        System.out.println(day(data));
        System.out.println(dayOfWeek(data));

    }

    public static int dataYear(OffsetDateTime data){
        return data.getYear();
    }

    public static String month(OffsetDateTime data){
        return String.valueOf(data.getMonth());
    }

    public static int day(OffsetDateTime data){
        return data.getDayOfMonth();
    }

    public static String dayOfWeek(OffsetDateTime data) {
        return String.valueOf(data.getDayOfWeek());
    }
}