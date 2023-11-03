import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class MainTest {
    private Main testing = new Main();

    private ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

    @Test
    void piuOneYear() {
        String attuale = testing.piuOneYear(data);

        assertEquals("1 mar 2024",attuale,"piu Anno");
    }

    @Test
    void piuOneYearNull() {
        String attuale = null;

        assertNull(attuale,"Null");
    }

    @Test
    void minusMonth() {
        String attuale = testing.minusMonth(data);

        assertEquals("1 feb 2023",attuale,"meno Mese");
    }

    @Test
    void minusMonthNull() {
        String attuale = null;

        assertNull(attuale,"Null");
    }

    @Test
    void plusDays() {

        String attuale = testing.plusDays(data);

        assertEquals("8 mar 2023" ,attuale,"piu 7 giorni");
    }

    @Test
    void plusDaysNull() {
        String attuale = null;

        assertNull(attuale,"Null");
    }
}