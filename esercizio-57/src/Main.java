import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        OffsetDateTime dataAttuale = OffsetDateTime.now();

        compareDate(date1,date2,dataAttuale);
    }

    public static void compareDate(OffsetDateTime date1,OffsetDateTime date2,OffsetDateTime dataAttuale){
        Boolean firstBefore = date1.isBefore(date2);
        System.out.println("La prima data viene prima della seconda? " + firstBefore);

        Boolean secondAfter = date2.isAfter(date1);
        System.out.println("La seconda data viene dopo della prima? " + secondAfter);

        if(date1.equals(OffsetDateTime.now())){
            System.out.println("E' uguale a data 1");
        }else if(date2.equals(OffsetDateTime.now())){
            System.out.println("E' uguale a data 2");
        }else{
            System.out.println("queste date non corrispondono ad ora! Perchè oggi è = " + dataAttuale.format(DateTimeFormatter.ISO_DATE));
        }

    }
}