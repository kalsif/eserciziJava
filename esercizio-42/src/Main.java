public class Main {
    public static void main(String[] args) {
            Integer numeratore = null;
            Integer denominatore = null;

            System.out.println(operazione(numeratore,denominatore));
    }
    public static String operazione(Integer num,Integer denom){
        Integer risultato = 0;
        try {
            risultato = num*denom;
        }catch (NullPointerException e){
            System.out.println("I valori non possono essere nulli");
        }
        return "Quindi il risultato è ancora = " + risultato;
    }
}