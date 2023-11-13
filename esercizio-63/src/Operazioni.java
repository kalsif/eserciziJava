import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operazioni {
    public static BigDecimal addizione(BigDecimal num1,BigDecimal num2){
        if(num1 != null || num2 != null){
            return num1.add(num2);
        }else{
            throw new NullPointerException("Errore");
        }
    }

    public static BigDecimal sottrazione(BigDecimal num1,BigDecimal num2){
        return num1.subtract(num2);
    }

    public static BigDecimal moltiplicazione(BigDecimal num1,BigDecimal num2){
        return num1.multiply(num2);
    }

    public static BigDecimal divisione(BigDecimal num1,BigDecimal num2){
        BigDecimal result = BigDecimal.ZERO;
        if(num1 == null){
            throw new NullPointerException("Num1 è null");
        }else if(num2 == null) {
            throw new NullPointerException("Num2 è null");
        } else if (num1 == null && num2 == null) {
            throw new NullPointerException("Entrambi i numeri sono null");
        } else if (num2.equals(BigDecimal.ZERO)) {
            throw new ArithmeticException("Non puoi dividere per 0");
        }else {
            result = num1.divide(num2,7,RoundingMode.DOWN);
            return result;
        }
    }

    public static BigDecimal min(BigDecimal num1,BigDecimal num2){
        if(num1 == null){
            throw new NullPointerException("Num1 è null");
        }else if(num2 == null) {
            throw new NullPointerException("Num2 è null");
        } else if (num1 == null && num2 == null) {
            throw new NullPointerException("Entrambi i numeri sono null");
        }else {
            return num1.min(num2);
        }
    }

    public static BigDecimal max(BigDecimal num1,BigDecimal num2){
        if(num1 == null){
            throw new NullPointerException("Num1 è null");
        }else if(num2 == null) {
            throw new NullPointerException("Num2 è null");
        } else if (num1 == null && num2 == null) {
            throw new NullPointerException("Entrambi i numeri sono null");
        }else {
            return num1.max(num2);
        }
    }


}
