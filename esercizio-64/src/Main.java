public class Main {
    public static void main(String[] args) {


        System.out.println(checkString("Questa è una stringa"));
    }

    public static String checkString(String value) {
        return value.length() >= 10
                ? "Lunghezza maggiore o uguale di 10"
                : "Lunghezza minore di 10";
    }
}
// Esercizio di pair svolto con Andrea!!