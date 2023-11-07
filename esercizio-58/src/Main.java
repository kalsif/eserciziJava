public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;


        try {
            System.out.println("Il quoziente della divisione è " + quoziente(a,b));
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static Integer quoziente(Integer x,Integer y){

        if(x == null || y == null){
            return null;
        }else if(y==0){
            throw new ArithmeticException("Non puoi dividere per 0");
        }

        int q = x/y;
        return q;
    }

}