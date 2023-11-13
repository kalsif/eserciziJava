import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
      BigDecimal num1 = BigDecimal.valueOf(3.5);
      BigDecimal num2 = BigDecimal.valueOf(3.9);
      BigDecimal num3 = BigDecimal.TEN;
      BigDecimal num4 = BigDecimal.valueOf(3.9);
      BigDecimal num5 = BigDecimal.ONE;
      BigDecimal num6 = BigDecimal.ZERO;

      Numero add = new Numero(num1,num2, Numero.Oper.ADDIZIONE);
      Numero add2 = new Numero(num3,num5, Numero.Oper.SOTTRAZIONE);
      Numero add3 = new Numero(num2,num4, Numero.Oper.MOLTIPLICAZIONE);
      Numero add4 = new Numero(num3,num6, Numero.Oper.DIVISIONE);
      Numero add5 = new Numero(num1,num4, Numero.Oper.MIN);
      Numero add6 = new Numero(num3,num2, Numero.Oper.MAX);

      try {
        BigDecimal risultato1 = TipoOper.tipoOperazione(add);
        System.out.println("numero 1 = " + num1 + "\nnumero 2 = " + num2 + "\nrisultato = " + risultato1 + "\noperazione = " + Numero.Oper.ADDIZIONE);
        System.out.println();

        BigDecimal risultato2 = TipoOper.tipoOperazione(add2);
        System.out.println("numero 1 = " + num3 + "\nnumero 2 = " + num5 + "\nrisultato = " + risultato2 + "\noperazione = " + Numero.Oper.SOTTRAZIONE);
        System.out.println();

        BigDecimal risultato3 = TipoOper.tipoOperazione(add3);
        System.out.println("numero 1 = " + num2 + "\nnumero 2 = " + num4 + "\nrisultato = " + risultato3 + "\noperazione = " + Numero.Oper.MOLTIPLICAZIONE);
        System.out.println();

        BigDecimal risultato4 = TipoOper.tipoOperazione(add4);
        System.out.println("numero 1 = " + num3 + "\nnumero 2 = " + num6 + "\nrisultato = " + risultato4 + "\noperazione = " + Numero.Oper.DIVISIONE);
        System.out.println();

        BigDecimal risultato5 = TipoOper.tipoOperazione(add5);
        System.out.println("numero 1 = " + num1 + "\nnumero 2 = " + num4 + "\nrisultato = " + risultato5 + "\noperazione = " + Numero.Oper.MIN);
        System.out.println();


        BigDecimal risultato6 = TipoOper.tipoOperazione(add6);
        System.out.println("numero 1 = " + num3 + "\nnumero 2 = " + num2 + "\nrisultato = " + risultato6 + "\noperazione = " + Numero.Oper.MAX);
      }catch (Exception e){
        System.out.println(e.getMessage());
      }

    }
}