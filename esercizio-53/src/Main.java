import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// Pair svolto con Valeria!!!

public class Main {
    public static void main(String[] args) {
        ZonedDateTime data2 = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");


        System.out.println(formatFull(data2));
        System.out.println(formatMedium(data));
        System.out.println(formatShort(data));

    }

    public static String formatFull(ZonedDateTime data){
        return data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }

    public static String formatMedium(OffsetDateTime data){
        return data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }

    public static String formatShort(OffsetDateTime data){
        return data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
    }


}