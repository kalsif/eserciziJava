import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        System.out.println(formatt(data));

    }

    public static String formatt(String data) {
        if (data != null && !data.isBlank()) {
            OffsetDateTime formatData = OffsetDateTime.parse("2023-03-01T13:00:00Z");
            return formatData.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        } else {
            return "Errore";
        }
    }

}