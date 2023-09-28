
public class Main {
    public static void main(String[] args) {
        char a = '/';
        operation(a);
    }
    public static int operation(char x){
        switch (x){
            case '+':
                System.out.println("Questa è un addizione.");
                break;
            case '-':
                System.out.println("Questa è un sottrazione.");
                break;
            case '/':
                System.out.println("Questa è un divisione.");
                break;
            case '*':
                System.out.println("Questa è un moltiplicazione.");
                break;
            default:
                System.out.println("Allarme Allarme: Questa è un esercitazione!");
        };
        return x;
    }
}