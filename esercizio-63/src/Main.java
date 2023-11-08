import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
      BigDecimal num1 = BigDecimal.valueOf(3.5);
      BigDecimal num2 = BigDecimal.valueOf(3.9);
      BigDecimal num3 = BigDecimal.TEN;
      BigDecimal num4 = BigDecimal.valueOf(3.9);
      BigDecimal num5 = BigDecimal.ONE;
      BigDecimal num6 = BigDecimal.ZERO;

      Numero.Oper addizione = Numero.Oper.ADDIZIONE;
      Numero.Oper sottrazione = Numero.Oper.SOTTRAZIONE;
      Numero.Oper moltiplicazione = Numero.Oper.MOLTIPLICAZIONE;
      Numero.Oper divisione = Numero.Oper.DIVISIONE;
      Numero.Oper min = Numero.Oper.MIN;
      Numero.Oper max = Numero.Oper.MAX;



      BigDecimal risultato = Numero.tipoOperazione(num1,num2,addizione);
      BigDecimal risultato1 = Numero.tipoOperazione(num3,num5,sottrazione);
      BigDecimal risultato2 = Numero.tipoOperazione(num6,num4,moltiplicazione);
      BigDecimal risultato3 = Numero.tipoOperazione(num2,num6,divisione);
      BigDecimal risultato4 = Numero.tipoOperazione(num5,num1,min);
      BigDecimal risultato5 = Numero.tipoOperazione(num3,num2,max);

      System.out.println("Numero 1 = "+ num2 +  "\nnumero 2 = "+ num6+ "\nrisultato = "+ risultato3 + "\noperazione = " + divisione);
      System.out.println();
      System.out.println("Numero 1 = "+ num1 +  "\nnumero 2 = "+ num2+ "\nrisultato = "+ risultato + "\noperazione = " + addizione);
      System.out.println();
      System.out.println("Numero 1 = "+ num3 +  "\nnumero 2 = "+ num5+ "\nrisultato = "+ risultato1 + "\noperazione = " + sottrazione);
      System.out.println();
      System.out.println("Numero 1 = "+ num6 +  "\nnumero 2 = "+ num4+ "\nrisultato = "+ risultato2 + "\noperazione = " + moltiplicazione);
      System.out.println();
      System.out.println("Numero 1 = "+ num5 +  "\nnumero 2 = "+ num1+ "\nrisultato = "+ risultato4 + "\noperazione = " + min);
      System.out.println();
      System.out.println("Numero 1 = "+ num3 +  "\nnumero 2 = "+ num2+ "\nrisultato = "+ risultato5 + "\noperazione = " + max);

    }
}