public class Main {
    public static void main(String[] args) {
        char a = 'A';
        char t = 'T';

        System.out.println(a);
        System.out.println(t);
        System.out.println("la comparazione a != t è = " + equals(a,t));
    }
    public static boolean equals(char a,char t){
        boolean z = a != t;
        return z;
    }
}