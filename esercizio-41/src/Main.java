import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
// ti ho riinviato lo stesso esercizio probabilmente sbagliato ancora
// una volta ma giusto perchè in origine l avevo fatto così.. poi avevo deciso di
// utilizzare i double e ho scoperto infine che con float e double
// le divisioni per zero danno questi tipi di problemi
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        while(true){
            try {
                System.out.println(Arrays.toString(riempiArray(array, r)));
                System.out.println("scegli l indice del array e il divisore = ");
                dividiPerNum(array, sc);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice non presente nell' array " + e);
            }catch (ArithmeticException e) {
                System.out.println("Non puoi dividere per 0 " + e);
            }catch (InputMismatchException e){
                System.out.println("Non puoi usare altri caratteri!! " + e);
                sc.next();
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
        System.out.println("la tua scelta è = " + array[indice]);
        int num = sc.nextInt();
        int divisione = 0;

        for (int i = 0; i < array.length; i++) {
            divisione = array[indice] / num;
        }

        System.out.println("Il risultato della divisione è = " + divisione);
    }

}