import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] arrayB = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15,16}};
        System.out.println("la somma dei valori contenuti"+"\nall'interno della prima linea è = " + sum(arrayB));

    }

    public static int sum(int[][] x) {
        int somma = 0;
        int j = 0;
            for (j = 0; j <= x[0].length-1; j++) {
                somma += x[0][j];
            }
        return somma;
    }
}
