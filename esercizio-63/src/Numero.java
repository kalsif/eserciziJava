import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

// Pair fatto con Andrea Monizza!!

public class Numero {
    enum Oper{
        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        MIN,
        MAX;
    }
    BigDecimal num1;
    BigDecimal num2;

    Oper operazione;

    public Numero(BigDecimal num1,BigDecimal num2,Oper operazione) {
        this.num1 = num1;
        this.num2 = num2;
        this.operazione=operazione;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "num1=" + num1 +
                ", num2=" + num2+
                '}';
    }
}
