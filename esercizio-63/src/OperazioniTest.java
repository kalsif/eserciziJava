import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OperazioniTest {


    BigDecimal num1 = BigDecimal.valueOf(3.5);
    BigDecimal num2 = BigDecimal.valueOf(3.9);
    BigDecimal num3 = BigDecimal.TEN;
    BigDecimal num4 = BigDecimal.valueOf(3.9);
    BigDecimal num5 = BigDecimal.ONE;
    BigDecimal num6 = BigDecimal.ZERO;

    Numero add = new Numero(num1,num2, Numero.Oper.ADDIZIONE);
    Numero add2 = new Numero(num3,num5, Numero.Oper.SOTTRAZIONE);
    Numero add3 = new Numero(num2,num4, Numero.Oper.MOLTIPLICAZIONE);
    Numero add4 = new Numero(num4,num1, Numero.Oper.DIVISIONE);
    Numero add5 = new Numero(num1,num4, Numero.Oper.MIN);
    Numero add6 = new Numero(num3,num2, Numero.Oper.MAX);

    @Test
    public void addizione() {
        assertEquals(BigDecimal.valueOf(7.4),TipoOper.tipoOperazione(add));
    }

    @Test
    public void addizioneNull() {
        assertThrows(NullPointerException.class,() ->Operazioni.addizione(null,null));
    }

    @Test
    public void addizioneNumNull() {
        assertThrows(NullPointerException.class,() ->Operazioni.addizione(null,num2));
    }

    @Test
    public void addizioneNumNull2() {
        assertThrows(NullPointerException.class,() ->Operazioni.addizione(num1,null));
    }

    @Test
    public void sottrazione() {
        assertEquals(BigDecimal.valueOf(9),TipoOper.tipoOperazione(add2));
    }

    @Test
    public void sottrazioneNum1Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.sottrazione(null,num5));
    }

    @Test
    public void sottrazioneNum2Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.sottrazione(num3,null));
    }

    @Test
    public void sottrazioneNull() {
        assertThrows(NullPointerException.class,() -> Operazioni.sottrazione(null,null));
    }

    @Test
    public void moltiplicazione() {
        assertEquals(BigDecimal.valueOf(15.21),TipoOper.tipoOperazione(add3));
    }

    @Test
    public void moltiplicazioneNull() {
        assertThrows(NullPointerException.class,() -> Operazioni.moltiplicazione(null,null));
    }

    @Test
    public void moltiplicazioneNum1Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.moltiplicazione(null,num4));
    }

    @Test
    public void moltiplicazioneNum2Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.moltiplicazione(num2,null));
    }

    @Test
    public void divisione() {
        assertEquals(BigDecimal.valueOf(1.1142857),TipoOper.tipoOperazione(add4));
    }

    @Test
    public void divisionePerZero() {
        assertThrows(ArithmeticException.class,() -> Operazioni.divisione(num3,BigDecimal.ZERO));
    }

    @Test
    public void divisioneNum1Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.divisione(null,num6));
    }

    @Test
    public void divisioneNum2Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.divisione(num3,null));
    }

    @Test
    public void divisioneNull() {
        assertThrows(NullPointerException.class,() -> Operazioni.divisione(null,null));
    }

    @Test
    public void min() {
        assertEquals(num1,TipoOper.tipoOperazione(add5));
    }

    @Test
    public void minNum1Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.min(null,num4));
    }

    @Test
    public void minNum2Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.min(num1,null));
    }

    @Test
    public void max() {
        assertEquals(num3,TipoOper.tipoOperazione(add6));
    }

    @Test
    public void maxNum1Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.max(null,num2));
    }

    @Test
    public void maxNum2Null() {
        assertThrows(NullPointerException.class,() -> Operazioni.max(num3,null));
    }
}