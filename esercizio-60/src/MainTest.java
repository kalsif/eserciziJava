import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main testing = new Main();
    private OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");


    @Test
    void main() {
    }

    @Test
    void formatt() {
        String formatData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String data1 = testing.formatt(data);

        assertEquals(formatData,data1,"Data formattata");
    }

    @Test
    void formattNull() {
        String data1 = null;

        assertNull(data1,"Data formattata");
    }


}