import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student studente1 = new Student("Antonio", 1);
        Student studente2 = new Student("Mario", 2);
        Student studente3 = new Student("Michela", 3);
        Student studente4 = new Student("Giovanna", 4);

        Map<String, Student> listaAlunni = new LinkedHashMap<>();
        listaAlunni.put("Studente 1",studente1);
        listaAlunni.put("Studente 2 ",studente2);
        listaAlunni.put("Studente 3 ",studente3);
        listaAlunni.put("Studente 4 ",studente4);

        System.out.println(listaAlunni);

        Collection<Student> valori = listaAlunni.values();

        System.out.println(valori);



    }

}