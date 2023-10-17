public class Main {
    public static void main(String[] args) {
        char x = 'a';

        System.out.println(inNumber(x));
    }
    public static boolean inNumber(char x) {
        if(x >= '0' && x<= '9'){
            return true;
        }else{
            throw new IllegalCallerException("NON è UN NUMERO");
        }

    }
}