import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();
    private final String data = "2023-03-01T13:00:00Z";
    private final OffsetDateTime dataFormat = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void formatt() {
        String formatData = dataFormat.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        Main.formatt(data);
        assertEquals(formatData,Main.formatt(data));
    }

    @Test
    void formattNull() {
        Main.formatt(data);
        assertEquals("Errore",Main.formatt(null));
    }

    @Test
    void formattStringBlank() {
        Main.formatt(data);
        assertEquals("Errore",Main.formatt(""));
    }

}