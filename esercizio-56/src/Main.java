import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));



        System.out.println(newData(data));
    }

    public static String newData(ZonedDateTime data){
        data = data.plusYears(1);
        data = data.minusMonths(1);
        data = data.plusDays(7);

        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

}