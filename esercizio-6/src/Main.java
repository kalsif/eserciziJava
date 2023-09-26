public class Main {
    public static void main(String[] args) {
      System.out.println("il risultato della divisione è " + division(5,9));
      System.out.println("il modulo della divisione è " + module(5,9));
    }

    public static int division(int x,int y){
        int h = x / y;
        return h;
    }

    public static int module(int x,int y){
        int h2 = x % y;
        return h2;
    }
}