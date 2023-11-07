import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// esercizio pair con Valeria

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(formatData(data));
    }

    public static String formatData (OffsetDateTime data){
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

}