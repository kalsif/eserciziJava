import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

        System.out.println(piuOneYear(data));
        System.out.println(minusMonth(data));
        System.out.println(plusDays(data));

    }

    public static String piuOneYear(ZonedDateTime data){
        if(data==null){
            return null;
        }
        data = data.plusYears(1);
        String newData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        return newData;
    }

    public static String minusMonth(ZonedDateTime data){
        if(data==null){
            return null;
        }
        data = data.minusMonths(1);
        String newData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        return newData;
    }
    public static String plusDays(ZonedDateTime data){
        if(data==null){
            return null;
        }
        data = data.plusDays(7);
        String newData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        return newData;
    }

}