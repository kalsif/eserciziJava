import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        HashSet<Integer> lista =riempi(r);
        System.out.println(lista);
        System.out.print("Adesso scegli un numero da sottrarre alla lista = ");
        Integer confronto = in.nextInt();
        System.out.print("Lista con elementi rimossi = ");
        System.out.println(rimuovi(lista, confronto));

        System.out.println("L'elemento rimostto è = " + confronto);
        System.out.println("Adesso svuotiamo la lista!!");
        lista.clear();

        if(lista.isEmpty()){
            System.out.println("La lista è vuota");
        }else{
            System.out.println("La lista non è vuota");
        }

    }
    public static HashSet<Integer> riempi(Random r){
        HashSet<Integer> lista = new HashSet<>();
        lista.add(r.nextInt(10));
        lista.add(r.nextInt(10));
        lista.add(r.nextInt(10));
        lista.add(r.nextInt(10));
        lista.add(r.nextInt(10));
        lista.add(r.nextInt(10));
        lista.add(r.nextInt(10));
        lista.add(r.nextInt(10));
        return lista;
    }
    public static HashSet<Integer> rimuovi(HashSet<Integer> lista, Integer confronto){
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()){
            Integer numero = iterator.next();
            if(numero.equals(confronto)){
                iterator.remove();
            }
        }
        return lista;
    }

}