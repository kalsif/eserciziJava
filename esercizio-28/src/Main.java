import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Antonio","Troiano",1);
        Studente studente2 = new Studente("Francesco","Rossi",2);
        Studente studente3 = new Studente("Mario","Verdi",3);
        Studente studente4 = new Studente("Giambattista","Bianchi",4);
        ArrayList<Studente> studenti = new ArrayList<>();
        studenti.add(studente1);
        studenti.add(studente2);
        studenti.add(studente3);
        studenti.add(studente4);

        ArrayList<Studente> c1studenti= new ArrayList<>();
        ArrayList<Studente> c2studenti= new ArrayList<>();
        ArrayList<Studente> c3studenti= new ArrayList<>();

        c1studenti.add(studente1);
        c1studenti.add(studente2);
        c2studenti.add(studente3);
        c2studenti.add(studente4);

        Classe c1 = new Classe("Classe A", c1studenti);
        Classe c2 = new Classe("Classe B", c2studenti);
        System.out.println(studente1);
        System.out.println(studente2);
        System.out.println(studente3);
        System.out.println(studente4);

        System.out.println(c1.getStudenti());

        System.out.println(c2.getStudenti());

        studente1.setNumIdentif(5);
        System.out.println(c1.getStudenti());



    }
}