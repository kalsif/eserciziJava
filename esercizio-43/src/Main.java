public class Main {
    public static void main(String[] args) {

        int x = 123;//autoboxing
        Integer x1 = x;//unboxing

        double y = 2.5;
        double y1 = y;

        char c = 'c';
        Character c1 = c;

        System.out.println(somma(x,y));
        System.out.println(charValue(c));
        System.out.println(numeri(x1,y1));
        System.out.println(character(c1));



    }
    public static double somma (int x,double y){
        return x+y;
    }
    public static char charValue(char a){
        return a;
    }
    public static Double numeri (Integer num1,Double num2){
        return num1+num2;
    }
    public static Character character(Character character){
        return character;
    }
}