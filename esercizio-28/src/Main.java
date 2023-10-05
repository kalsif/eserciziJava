import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Antonio","Troiano",1);
        Studente studente2 = new Studente("Francesco","Rossi",2);
        Studente studente3 = new Studente("Mario","Verdi",3);
        Studente studente4 = new Studente("Giambattista","Bianchi",4);

        System.out.println(studente1);
        System.out.println(studente2);
        System.out.println(studente3);
        System.out.println(studente4);
        System.out.println();
        //Divido gli studenti nelle classi
        Classi classi = new Classi(new Studente[] {studente1, studente2}, new Studente[] {studente3, studente4});
        //tramite get visualizzo la classe A
        System.out.println(Arrays.toString(classi.getClasseA()));
        //tramite get visualizzo la classe B
        System.out.println(Arrays.toString(classi.getClasseB()));
        //tramite il metodo set modifico la classe A
        classi.setClasseA(new Studente[] {studente1,studente4});
        System.out.println(Arrays.toString(classi.getClasseA()));

        System.out.println(studente1.getNumIdentif()); // richiamo l id dello studente 1
        studente1.setNumIdentif(5);// cambio l id tramite il metodo setter
        System.out.println(studente1.getNumIdentif()); // richiamo l id dello studente 1 dopo la modifica


    }
}