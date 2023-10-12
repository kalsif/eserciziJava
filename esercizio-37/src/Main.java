public class Main {
    public static void main(String[] args) {
            String test = "Mi chiamo Antonio";
            Unicode unicode = new Unicode(test.toLowerCase());
            int posizione = 7;
            String risultato = unicode.unicodeChar(posizione);

        System.out.println(risultato);

    }
}