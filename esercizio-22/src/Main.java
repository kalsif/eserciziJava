public class Main {
    public static void main(String[] args) {
        int inizio = 10;
        int fine = 0;
        stop(inizio,fine);
    }
    public static void stop(int a,int b){
        for (int z = a ;z >= b; z--){
            if (z == 5){
                continue;
            }
            System.out.println(z);
        }
    }
}