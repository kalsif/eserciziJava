import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(ottieniAnno(data));
        System.out.println(ottieniMese(data));
        System.out.println(ottieniGiorno(data));
        System.out.println(ottieniGiornoWeek(data));
    }

    public static String ottieniAnno(OffsetDateTime data){
        if(data == null){
            return null;
        }
        String year = String.valueOf(data.getYear());
        return year;
    }

    public static String ottieniMese(OffsetDateTime data){
        if(data == null){
            return null;
        }
        String month = String.valueOf(data.getMonth());
        return month;
    }

    public static String ottieniGiorno(OffsetDateTime data){
        if(data == null){
            return null;
        }
        String day = String.valueOf(data.getDayOfMonth());
        return day;
    }

    public static String ottieniGiornoWeek(OffsetDateTime data){
        if(data == null){
            return null;
        }
        String dayWeek = String.valueOf(data.getDayOfWeek());
        return dayWeek;
    }

}