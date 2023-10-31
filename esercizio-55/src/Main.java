import java.time.OffsetDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int dataYear = data.getYear();
        String month = String.valueOf(data.getMonth());
        int day = data.getDayOfMonth();
        String dayOfWeek = String.valueOf(data.getDayOfWeek());

        System.out.println(dataYear);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfWeek);

    }
}