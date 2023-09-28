public class Main {
    public static void main(String[] args) {
        int x = 7;
        week(x);
    }
    public static void week(int day){
        switch(day){
            case 1:
                System.out.println("Corrisponde a Lunedì");
                break;
            case 2:
                System.out.println("Corrisponde a Martedì");
                break;
            case 3:
                System.out.println("Corrisponde a Mercoledì");
                break;
            case 4:
                System.out.println("Corrisponde a Giovedì");
                break;
            case 5:
                System.out.println("Corrisponde a Venerdì");
                break;
            case 6:
                System.out.println("Corrisponde a Sabato");
                break;
            case 7:
                System.out.println("Corrisponde a Domenica");
                break;
            default:
                System.out.println("Questo non è un giorno della settimana");

        }
    }
}