import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataStringa2 = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String dataStringa3 = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));


        ZonedDateTime data2 = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dataStringa = data2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));


        System.out.println(dataStringa);
        System.out.println(dataStringa2);
        System.out.println(dataStringa3);
    }

    // Pair svolto con Valeria!!!
}