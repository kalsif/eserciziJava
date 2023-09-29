import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5,5,5,6,7,7,8,9,10};
        System.out.println(Arrays.toString(controll(array)));
    }
    public static int[] controll(int[] a){
        int[] newarr = new int[a.length];
        int x = 0;
        for (int i = 0;i<a.length-1;i++){
            if(a[i] != a[i + 1]){
                newarr[x++] = a[i];
            }else{
                newarr[x++] = -1;
            }
        }
        newarr[x++] = a[a.length-1];
        return newarr;
    }
}