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

    Oper Operazione;

    public Numero(BigDecimal num1,BigDecimal num2,Oper Operazione) {
        this.num1 = num1;
        this.num2 = num2;
        this.Operazione=Operazione;
    }

    public static BigDecimal tipoOperazione(BigDecimal num1,BigDecimal num2,Numero.Oper oper){
        BigDecimal result = BigDecimal.ZERO;

        switch (oper){
            case ADDIZIONE:
                result = num1.add(num2);
                break;
            case SOTTRAZIONE:
                result = num1.subtract(num2);
                break;
            case MOLTIPLICAZIONE:
                result = num1.multiply(num2);
                break;
            case DIVISIONE:
                if(!num2.equals(BigDecimal.ZERO)){
                    result = num1.divide(num2,7, RoundingMode.DOWN);
                }else{
                    System.out.println("Impossibile dividere per 0");
                }
                break;
            case MIN:
                result = num1.min(num2);
                break;
            case MAX:
                result = num1.max(num2);
                break;
            default:
                System.out.println("Questa operazione non è disponibile!!");
        }
        return result;
    }
}
