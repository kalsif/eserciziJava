public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(52,11);
        Punto punto2 = new Punto(20,7);
        Punto punto3 = new Punto(10,138);


        Punto punto4 = new Punto(52,11);

        boolean sonoUguali = punto1.equals(punto4);

        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto3);
        System.out.println(sonoUguali);
        System.out.println(punto1.x());
        System.out.println(punto2.y());

    }
}