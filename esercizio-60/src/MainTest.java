import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();
    private final OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void formatt() {
        String formatData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String data1 = Main.formatt(data);
        assertEquals(formatData,data1,"Data formattata");
    }

    @Test
    void formattNull() {
        Main.formatt(data);
        assertEquals("Errore",Main.formatt(null));
    }

}