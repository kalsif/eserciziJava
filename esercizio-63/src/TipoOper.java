import java.math.BigDecimal;

public class TipoOper {
    public static BigDecimal tipoOperazione(Numero numero){

        switch (numero.operazione){
            case ADDIZIONE:
                return Operazioni.addizione(numero.num1,numero.num2);
            case SOTTRAZIONE:
                return Operazioni.sottrazione(numero.num1,numero.num2);
            case MOLTIPLICAZIONE:
                return Operazioni.moltiplicazione(numero.num1,numero.num2);
            case DIVISIONE:
                return Operazioni.divisione(numero.num1,numero.num2);
            case MIN:
                return Operazioni.min(numero.num1,numero.num2);
            case MAX:
                return Operazioni.max(numero.num1,numero.num2);
            default:
                System.out.println("Questa operazione non è disponibile!!");
        }
        return null;
    }
}
