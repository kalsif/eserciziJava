import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student studente1 = new Student("Antonio", 1);
        Student studente2 = new Student("Mario", 2);
        Student studente3 = new Student("Michela", 3);
        Student studente4 = new Student("Giovanna", 4);

        Map<String, Student> listaAlunni = new HashMap<>();
        listaAlunni.put("2",studente2);
        listaAlunni.put("3",studente3);
        listaAlunni.put("1",studente1);
        listaAlunni.put("4",studente4);

        Map<String,Student> listaOrdinata = new LinkedHashMap<>(listaAlunni);

        Collection<Student> valori = listaOrdinata.values();

        System.out.println(valori);



    }

}