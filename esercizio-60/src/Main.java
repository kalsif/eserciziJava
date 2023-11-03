import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(formatt(data));

    }

    public static String formatt(OffsetDateTime data){
        if(data==null){
            return null;
        }

        String formatData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        return formatData;
    }

}