import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
// a causa di Antonio Buonanno io quest oggi per svolgere questo esercizio non ho potuto studiare il resto arrivederci.
//se ti stai chiedendo se il fatto che il gioco sia infinito è una cosa voluta si lo è!!
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        double[] array = new double[10];

        while(true){
            try {
                System.out.println(Arrays.toString(riempiArray(array, r)));
                System.out.println("scegli l indice del array e il divisore = ");
                dividiPerNum(array, sc);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice non presente nell' array");
            }catch (ArithmeticException e) {
                System.out.println("Non puoi dividere per 0");
            }catch (InputMismatchException e){
                System.out.println("Non puoi usare altri caratteri!!");
                sc.next();
            }finally {
                System.out.println("MOLTO BENE ANCORA");
            }
        }
    }

    public static double[] riempiArray(double[] array, Random r) {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(0, 10);
        }
        return array;
    }
    public static void dividiPerNum(double[] array, Scanner sc) {
        double indice= sc.nextDouble();
        System.out.println("la tua scelta è = " + array[(int) indice]);
        double num = sc.nextDouble();
        double divisione = 0;

        for (int i = 0; i < array.length; i++) {
            divisione = array[(int) indice] / num;
        }

        System.out.println("Il risultato della divisione è = " + divisione);
    }

}