
public class Main {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3}, {4, 5, 6}};

        if(righeStessoNumeroDiElementi(matrice)){
            stampa(scambio(matrice));
        }else{
            System.out.println("La matrice ha dimensioni diverse.");
        }



    }
    public static int [][] scambio(int[][] matrice) {
        int[][] risultato = new int[matrice[0].length][matrice.length];
        for (int i = 0; i < matrice.length; i++){
            for (int j = 0;j<matrice[i].length;j++){
                risultato[j][i] = matrice[i][j];
            }
        }
        return  risultato;
    }

    public static boolean righeStessoNumeroDiElementi(int[][] matrice){
        int righe = 0;
        for (int i = 0;i<matrice.length;i++){
            righe++;
        }
        int [] elementiColonne = new int[righe];

        for(int i = 0;i< matrice.length;i++){
            elementiColonne[i]= matrice[i].length;
        }
        return sonoUguali(elementiColonne);
    }

    public static boolean sonoUguali(int[] array){
       if (array == null || array.length == 0){
           return false;
       }
       for (int i=0;i< array.length;i++){
           if(array[0] != array[1]){
               return false;
           }
       }
       return true;
    }
    public static void stampa(int[][] matrice){
        for (int i=0;i< matrice.length;i++){
            for (int j=0;j< matrice[i].length;j++){
                System.out.println(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

}