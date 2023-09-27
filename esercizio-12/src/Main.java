
public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 20;
        double z = 13.5;
        System.out.println("il limite di partenza è = " + x + " il limite di arrivo è = " + y);
        System.out.println("se il numero è = " + z + " allora il range risulta " + range(x,y,z));
    }
    public static boolean range(int x,int y,double z){
        boolean z2 = (z >= x) && (z <= y);
        return z2;
    }
}