public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(12,15);
        Triangolo triangolo = new Triangolo(21,5);

        System.out.println(rettangolo.calcoloArea());
        System.out.println(triangolo.calcoloArea());


    }
}