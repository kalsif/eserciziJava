import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> insieme = new HashSet<>();
        System.out.println(riempiEStampaHash(insieme,r));

        System.out.println(insieme.size());
    }
    public static Set<Integer> riempiEStampaHash(Set<Integer> insieme,Random r){
        insieme.add(r.nextInt(10));
        insieme.add(r.nextInt(10));
        insieme.add(r.nextInt(10));
        insieme.add(r.nextInt(10));
        insieme.add(r.nextInt(10));

        for(Integer elementi : insieme){
            System.out.println(elementi);
        }

        return insieme;
    }

}