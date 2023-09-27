public class Main {
    public static void main(String[] args) {
       int x = 5;
       System.out.println(x + " è dispari? = " + dispari(x));
        System.out.println(x + " è pari? = " + pari(x));
    }
    public static boolean dispari(int x){
        boolean dispari = !(x % 2 == 0);
        return dispari;
    }
    public static boolean pari(int x){
        boolean pari = (x % 2 == 0);
        return pari;
    }
}