public class Main {
    public static void main(String[] args) {

        Animale pet = new Animale();
        Gatto cat = new Gatto();
        Cane cane = new Cane();

        System.out.println(pet);
        System.out.println(cat);

        cat.faiIlVerso();
        cane.faiIlVerso();
    }
}