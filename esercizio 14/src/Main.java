public class Main {
    public static void main(String[] args) {
        controllo(1);
        controllo(2);
        controllo(3);
        controllo(4);
        controllo(5);
        controllo(6);
        controllo(7);
        controllo(8);
        controllo(9);
        controllo(10);
        controllo(11);
        controllo(12);
        controllo(13);
        controllo(14);
        controllo(15);
    }
    public static void controllo(int x){
        if (x % 3 == 0 && x % 5 == 0){
            System.out.println("FizzBuzz");
        }else if (x % 5 == 0){
            System.out.println("Buzz");
        }else if (x % 3 == 0){
            System.out.println("Fizz");
        }else{
            System.out.println(x);
        }
    }
}