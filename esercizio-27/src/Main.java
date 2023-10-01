
public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3,}, {4, 5, 6}};
        int[][] newArray = scambio(array);
        stampa(newArray);

    }
    public static int [][] scambio(int[][] x){
        int righe = x.length;
        int colonne = x[0].length;
        //inizializzo la newArray con i valori invertiti
        //dove le righe sono uguali alla lunghezza delle colonne e viceversa
        int[][] newArray = new int[colonne][righe];
        //ciclo all interno di array
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                //dichiaro che i valori di newArray vuoti vengano riempiti
                //con quelli di array
                newArray[j][i] = x[i][j];
            }
        }
        return newArray;
    }
    // creo una fuzione che mi stampi la newArray a video
    public static void stampa(int[][] z){
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                System.out.println("value ["+i+"]["+j+"]"+z[i][j]);

            }
        }
    }
}