public class Main {
    public static void main(String[] args) {
            Integer numeratore = null;
            Integer denominatore = null;
            try {
                System.out.println(operazione(numeratore,denominatore));
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }
    }
    public static Integer operazione(Integer num,Integer denom){
        if(num==null && denom!=null){
            throw new NullPointerException("Il num è nullo");
        } else if (denom==null&&num!=null) {
            throw new NullPointerException("il denominatore è nullo");
        } else if (denom==null&&num==null) {
            throw new NullPointerException("numeratore e denominatore sono null");
        }else{
            return num*denom;
        }
    }
}