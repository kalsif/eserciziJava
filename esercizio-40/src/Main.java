public class Main {
    public static void main(String[] args) {
        int x = 7;
        int y = 0;
        try{
            System.out.println(divisione(x,y));
        }catch (ArithmeticException e){
            System.out.println(e);
        }


    }
    public static int divisione(int x,int y){
        if(y == 0){
            throw new ArithmeticException("Non è possibile dividere per 0");
        }else{
            return x / y;
        }
    }

}