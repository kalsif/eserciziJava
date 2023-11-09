import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();
    private ZonedDateTime data = ZonedDateTime.parse("2002-03-01T13:00:00Z");
    OffsetDateTime data1 = OffsetDateTime.parse("2002-03-01T13:00:00Z");

    @Test
    void printFull() {
        String formData = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String fullFormatt = testing.printFull(data);

        assertEquals(formData,fullFormatt,"Data formattata in Full style");
    }

    @Test
    void printFullNull() {
        Main.printFull(data);
        assertEquals("Errore",Main.printFull(null));
    }


    @Test
    void printMed() {
        String formData1 = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String mediumFormatt = testing.printMed(data1);

        assertEquals(formData1,mediumFormatt,"Data formattata in Medium style");
    }
    @Test
    void printMedNull() {
        Main.printMed(data1);
        assertEquals("Errore",Main.printMed(null));
    }

    @Test
    void printShort() {
        String formData2 = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        String shortFormatt = testing.printShort(data1);

        assertEquals(formData2,shortFormatt,"Data formattata in Short style");
    }

    @Test
    void printShortNull() {
        Main.printShort(data1);
        assertEquals("Errore",Main.printShort(null));
    }


}