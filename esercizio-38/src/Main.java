public class Main {
    public static void main(String[] args) {
        int inRange = 30;

        System.out.println(numInRange(inRange,0,20));
    }
    public static boolean numInRange(int x,int y,int z) {
        if(x>=y && x <= z){
            return true;
        }else{
            throw new ArithmeticException("THE NUMBER IS NOT IN RANGE");
        }
    }
}