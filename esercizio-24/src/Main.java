import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] array = new char[20];
        occorenza(array);
    }
    public static void occorenza(char[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] = 'a';
            } else {
                a[i] = '0';
            }
        }
        System.out.println(a);

        for (int i = 0;i < a.length; i++){
            if(a[i] == 'a'){
                x = x + 1;
            }
        }
        if (x != 0){
            System.out.println(x);
        }else{
            System.out.println('0');
        }
    }

}


