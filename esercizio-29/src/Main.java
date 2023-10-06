public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1300,"ES123PT","Fiat","500x");
        Auto auto2 = new Auto(1800,"BC730PQ","BMW","X1");

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println("Auto 1 cilindrata = "+ auto1.getCilindrata());
        System.out.println("Auto 1 modello = " + auto1.getModello());
        System.out.println("Auto 2 cilindrata = " + auto2.getCilindrata());
        System.out.println("Auto 2 modello = " + auto2.getModello());
        auto1.setCilindrata(1600);
        System.out.println("Auto 1 cilindrata modificata = " + auto1.getCilindrata());

    }


}