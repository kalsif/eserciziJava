import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    @Test
    void quoziente_tra_int() {
        int result = testing.quoziente(1,2);
        assertEquals(0,result,"Dovrebbe restituire un double");
    }

    @Test
    void quoziente_tra_int2() {
        int result = testing.quoziente(2,5);
        assertEquals(0,result,"Dovrebbe restituire un double");
    }

    @Test
    void quoziente_tra_int_e_null() {
        Integer result = testing.quoziente(1,null);
        assertNull(result,"Dovrebbe restituire null");
    }

    @Test
    public void quoziente_tra_int_e_0() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Main.quoziente(5,0);
        });


        assertEquals("Non puoi dividere per 0",exception.getMessage());
    }


}