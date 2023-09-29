public class Main {
    public static void main(String[] args) {
        int inizio = 100;

        decremento(inizio);
    }
    public static void decremento(int a){
        int max = 7;
        for (int z=a; z >= a - max ; z--){

            System.out.println(z);
        }
    }
}