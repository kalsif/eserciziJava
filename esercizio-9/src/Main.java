public class Main {
    public static void main(String[] args) {
        int x = 26;
        int y = 11;
        System.out.print(incMulti(x,y));
    }
    public static double incMulti(double x,int y){
        x += 13.9;
        y *= 5;
        return x * y;
    }

}