public class Main {
    public static void main(String[] args) {
        int inRange = 30;

        System.out.println(numInRange(inRange));
    }
    public static boolean numInRange(int x) {
        if(x>=0 && x <= 20){
            return true;
        }else{
            throw new ArithmeticException("THE NUMBER IS NOT IN RANGE");
        }
    }
}