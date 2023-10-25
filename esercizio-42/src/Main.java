public class Main {
    public static void main(String[] args) {
            Integer numeratore = 5;
            Integer denominatore = null;
            try {
                System.out.println(operazione(numeratore,denominatore));
            }catch (NullPointerException e){
                System.out.println("Il valore è nullo = "+ e.getMessage());
            }
    }
    public static Integer operazione(Integer num,Integer denom){
        Integer risultato = 0;
        risultato = num*denom;
        if(num==null||denom==null){
            throw new NullPointerException();
        }
        return risultato;
    }
}