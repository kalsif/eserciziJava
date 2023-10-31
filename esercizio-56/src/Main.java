import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        modificaData(data);
    }
    public static void modificaData (OffsetDateTime data){
        String dataIniziale = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(dataIniziale);

        OffsetDateTime plusOneYear = data.plusYears(1);
        String plusOneYear1 = plusOneYear.format(DateTimeFormatter.ofPattern("dd MMMM yyyy",Locale.ITALY));
        System.out.println(plusOneYear1);

        OffsetDateTime minusOneMonth = data.minusMonths(1);
        String minusOneMonth1 = minusOneMonth.format(DateTimeFormatter.ofPattern("dd MMMM yyyy",Locale.ITALY));
        System.out.println(minusOneMonth1);

        OffsetDateTime plusSevenDays = data.plusDays(7);
        String plusSevenDays1 = plusSevenDays.format(DateTimeFormatter.ofPattern("dd MMMM yyyy",Locale.ITALY));
        System.out.println(plusSevenDays1);


    }
}