public class Main {
    public static void main(String[] args) {
            Integer numeratore = null;
            Integer denominatore = 5;
            try {
                System.out.println(operazione(numeratore,denominatore));
            }catch (Exception e){
                System.out.println(e);
            }
    }
    public static Integer operazione(Integer num,Integer denom){
        Integer risultato = 0;
        risultato = num*denom;
        if(num==null){
            throw new NullPointerException();
        }
        if(denom==null){
            throw new NullPointerException();
        }
        return risultato;
    }
}