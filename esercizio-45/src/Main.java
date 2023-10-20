import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Studenti> liste = riempi();

        System.out.println(liste);

        Studenti studente4 = new Studenti("Antonio");
        liste.add(studente4);

        presente(liste,studente4);
    }

    public static HashSet<Studenti> riempi(){
        HashSet<Studenti> lista1 = new HashSet<>();
        Studenti studente1 = new Studenti("Antonio");
        Studenti studente2 = new Studenti("Francesco");
        Studenti studente3 = new Studenti("Matteo");

        lista1.add(studente1);
        lista1.add(studente2);
        lista1.add(studente3);
        return lista1;
    }
    public static void presente(Set<Studenti> liste,Studenti studente4){
        boolean presente = liste.contains(studente4);

        if(presente){
            System.out.println("l'oggetto è già presente nella lista");
        }else {
            System.out.println("L'oggetto non è presente");
        }
    }

}