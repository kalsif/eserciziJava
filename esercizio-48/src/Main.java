import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student studente1 = new Student("Mario",25);
        Student studente2 = new Student("Carlo",24);
        Student studente3 = new Student("Ugo",31);
        Student studente4 = new Student("Antonio",18);
        Student studente5 = new Student("Michele",35);
        Student studente6 = new Student("Fabio",18);
        Student studente7 = new Student("Carla",33);
        Student studente8 = new Student("Viviana",29);
        Student studente9 = new Student("Margherita",26);
        Student studente10 = new Student("Elisa",34);
        Student studente11 = new Student("Valeria",30);
        Student studente12 = new Student("Nadia",29);

        ArrayList<Student> lista = new ArrayList<>();
        lista.add(studente1);
        lista.add(studente2);
        lista.add(studente3);
        lista.add(studente4);
        lista.add(studente5);
        lista.add(studente6);
        lista.add(studente7);
        lista.add(studente8);
        lista.add(studente9);
        lista.add(studente10);
        lista.add(studente11);
        lista.add(studente12);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Student::getAge));

        System.out.println("Lista aggiornata in ordine d'età =" + lista);

    }
}