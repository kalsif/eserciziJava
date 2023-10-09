public class Main {
    public static void main(String[] args) {
        int inizio = 10;
        int fine = 0;
        stop(inizio,fine);
    }
    public static void stop(int a,int b){

        for (int z = a ;z >= b; z--){
            System.out.println(z);
            if (z == 5){
                break;
            }

        }
    }
}