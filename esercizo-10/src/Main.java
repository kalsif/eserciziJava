public class Main {
    public static void main(String[] args) {
     int x = 121;
     int y = 221;

     System.out.println(x);
     System.out.println(y);
     System.out.println("la comparazione x == y è = " + equals(x,y));
    }
    public static boolean equals(int x,int y){
        boolean z = x == y;
        return z;
    }
}