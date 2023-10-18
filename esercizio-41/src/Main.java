import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        boolean riprova = true;

        while(riprova){
            try {
                System.out.println(Arrays.toString(riempiArray(array, r)));
                System.out.println("scegli l indice del array e il divisore = ");
                dividiPerNum(array, sc);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice non presente nell' array");
                riprova = true;
            }catch (ArithmeticException e) {
                System.out.println("Non puoi dividere per 0");
            }catch (InputMismatchException e){
                System.out.println("Non puoi usare altri caratteri!!");
            }finally {
                System.out.println("MOLTO BENE ANCORA");
            }
        }
    }

    public static int[] riempiArray(int[] array, Random r) {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(0, 10);
        }
        return array;
    }
    public static void dividiPerNum(int[] array, Scanner sc) {
        int indice= sc.nextInt();
        int num = sc.nextInt();
        int divisione = 0;
        for (int i = 0; i < array.length; i++) {
            divisione = array[indice] / num;
        }
        System.out.println("Il risultato della divisione è = " + divisione);
    }

}