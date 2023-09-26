
public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        int z = 13;

        System.out.println("la media dei numeri è = " + media(x,y,z));
    }
    public static double media(int x,int y,int z){
        double h = ((double)x + (double)y + (double)z)/2;
        return h;
    }
}