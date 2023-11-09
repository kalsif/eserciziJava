import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Riprendi l'esercizio sulle date :
//
//        Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//        Formatta la data ottenuta in FULL, MEDIUM e SHORT
//        Stampa le varie versioni
public class Main {
    public static void main(String[] args) {

        ZonedDateTime data = ZonedDateTime.parse("2002-03-01T13:00:00Z");
        OffsetDateTime data1 = OffsetDateTime.parse("2002-03-01T13:00:00Z");


        printFull(data);
        printMed(data1);
        printShort(data1);
    }

    public static String printFull(ZonedDateTime data){
        if(data != null){
            String formData = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
            System.out.println(formData);
            return formData;
        }else{
            return "Errore";
        }



    }

    public static String printMed(OffsetDateTime data1){
        if(data1 != null){
            String formData1 = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
            System.out.println(formData1);
            return formData1;
        }else{
            return "Errore";
        }

    }

    public static String printShort(OffsetDateTime data1){
        if (data1 != null){
            String formData2 = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
            System.out.println(formData2);
            return formData2;
        }else{
            return "Errore";
        }




    }


}