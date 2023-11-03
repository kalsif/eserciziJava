import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();

    private OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void ottieniAnno() {
        String ottieniAnno = String.valueOf(data.getYear());
        String attuale = testing.ottieniAnno(data);

        assertEquals(ottieniAnno,attuale,"Anno");
    }

    @Test
    void ottieniAnnoNull() {
        String attuale = null;

        assertNull(attuale,"Null");
    }

    @Test
    void ottieniMese() {
        String ottieniMese = String.valueOf(data.getMonth());
        String attuale = testing.ottieniMese(data);

        assertEquals(ottieniMese,attuale,"Mese");
    }

    @Test
    void otiieniMeseNull() {
        String attuale = null;

        assertNull(attuale,"Null");
    }

    @Test
    void ottieniGiorno() {
        String ottieniGiorno = String.valueOf(data.getDayOfMonth());
        String attuale = testing.ottieniGiorno(data);

        assertEquals(ottieniGiorno,attuale,"Giorno");
    }

    @Test
    void ottieniGiornoNull() {
        String attuale = null;

        assertNull(attuale,"Null");
    }

    @Test
    void ottieniGiornoWeek() {
        String ottieniGiornoWeek = String.valueOf(data.getDayOfWeek());
        String attuale = testing.ottieniGiornoWeek(data);

        assertEquals(ottieniGiornoWeek,attuale,"Giorno week");
    }

    @Test
    void ottieniGiornoWeekNull() {
        String attuale = null;

        assertNull(attuale,"Null");
    }
}