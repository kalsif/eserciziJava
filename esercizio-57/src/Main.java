import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        OffsetDateTime dataAttuale = OffsetDateTime.now();

        System.out.println("La prima data viene prima della seconda? " + firstBefore(date1,date2));
        System.out.println("La seconda data viene dopo della prima? " + secondAfter(date2,date1));
        compareToday(date1,date2,dataAttuale);
    }

    public static void compareToday(OffsetDateTime date1,OffsetDateTime date2,OffsetDateTime dataAttuale){
        if(date1.equals(OffsetDateTime.now())){
            System.out.println("E' uguale a data 1");
        }else if(date2.equals(OffsetDateTime.now())){
            System.out.println("E' uguale a data 2");
        }else{
            System.out.println("queste date non corrispondono ad ora! Perchè oggi è = " + dataAttuale.format(DateTimeFormatter.ISO_DATE));
        }

    }

    public static Boolean firstBefore(OffsetDateTime date1 ,OffsetDateTime date2){
        return date1.isBefore(date2);
    }

    public static Boolean secondAfter(OffsetDateTime date2, OffsetDateTime date1){
        return date2.isAfter(date1);
    }
}