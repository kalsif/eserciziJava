
public class Main {
    public static void main(String[] args) {
        String myName = "Mi chiamo Antonio Troiano";
        int lung = myName.length();
        dieciCara(lung);
    }
    public static void dieciCara(int x){
        if (x > 10){
            System.out.println("Lunghezza maggiore di 10");
        }else if (x == 10){
            System.out.println("Lunghezza uguale a 10");
        }else{
            System.out.println("Lunghezza minore di 10");
        }
    }
}