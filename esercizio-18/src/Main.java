public class Main {
    public static void main(String[] args) {
        int limite = 5;
        int somma = inc(limite);
        System.out.println(somma);
    }
    public static int inc(int limite){
        int sum = 0;
        int x = 0;
        while (x < limite){
            sum += x;
            x++;
        };
        return sum;
    }
}