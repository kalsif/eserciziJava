import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Mela");
        Fruit fruit2 = new Fruit("Banana");
        Fruit fruit3 = new Fruit("Pera");
        Fruit fruit4 = new Fruit("Percoca");
        Fruit fruit5 = new Fruit("Melone");
        Fruit fruit6 = new Fruit("Albicocca");
        Fruit fruit7 = new Fruit("Ananas");

        LinkedList<Fruit> lista = new LinkedList<>();

        lista.add(fruit1);
        lista.add(fruit2);
        lista.add(fruit3);
        lista.add(fruit4);
        lista.add(fruit5);
        lista.add(fruit6);
        lista.add(fruit7);

        System.out.println(lista);

        Fruit fruit8 = new Fruit("Prugna");
        Fruit fruit9 = new Fruit("Uva");

        lista.addFirst(fruit8);
        System.out.println(lista);

        lista.addLast(fruit9);
        System.out.println(lista);

    }
}