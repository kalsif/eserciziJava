public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3.2,3.5);
        Triangolo triangolo = new Triangolo(5.8,6.10);

        System.out.println(rettangolo.calcoloArea());
        System.out.println(triangolo.calcoloArea());
        System.out.println(triangolo);
        triangolo.setAltezza(5);
        System.out.println(triangolo.calcoloArea());


    }
}