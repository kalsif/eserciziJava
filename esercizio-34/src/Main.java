public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3.2,3.5);
        Triangolo triangolo = new Triangolo(8.1, 10);

        System.out.println(rettangolo.calcoloArea());
        System.out.println(triangolo.calcoloArea());

    }
}