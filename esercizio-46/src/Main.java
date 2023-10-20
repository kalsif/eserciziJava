import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> utilitarie = new ArrayList<>();
        utilitarie.add("punto");
        utilitarie.add("C1");
        utilitarie.add("Panda");

        ArrayList<String> suv = new ArrayList<>();
        suv.add("X5");
        suv.add("Q5");
        suv.add("Range");

        ArrayList<String> suv2 = new ArrayList<>();
        suv2.add("X5");
        suv2.add("Q5");
        suv2.add("Range");

        Auto modello = new Auto(utilitarie);
        Auto modello1 = new Auto(suv);
        Auto modello2 = new Auto(suv2);



        Set<Auto> lista = riempi(modello,modello1);

        lista.add(modello2);


        System.out.println(lista);;
    }
    public static HashSet<Auto> riempi(Auto modello,Auto modello1){
        HashSet<Auto> lista = new HashSet<>();
        lista.add(modello);
        lista.add(modello1);
        return lista;
    }
}