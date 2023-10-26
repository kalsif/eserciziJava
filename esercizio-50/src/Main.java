import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> lista1 = new HashMap<>();
        lista1.put("Alunno1","Troiano");
        lista1.put("Alunno2","Rossi");
        lista1.put("Alunno3","Verdi");

        System.out.println(lista1);

        Map<String,String> lista2 = Map.of("Alunno1","Troiano", "Alunno2","Rossi","Alunno3","Verdi");

        System.out.println(lista2);

        Map<String,String> lista3 = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("Alunno1","Troiano"),
            new AbstractMap.SimpleEntry<>("Alunno2","Rossi"),
            new AbstractMap.SimpleEntry<>("Alunno3","Verdi")
        );

        System.out.println(lista3);
    }
}