import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayVuoto = new int[10];
        int somma = calcolo(arrayVuoto);
        System.out.println(somma);
    }
    public static int calcolo(int[] a){
        int somma = 0;
        for (int i=0;i<a.length;i++){
            a[i] = i + 1;
            somma += a[i];
        }
        return somma;
    }
}