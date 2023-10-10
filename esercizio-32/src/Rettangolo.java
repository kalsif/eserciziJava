public class Rettangolo extends Forma{

    public Rettangolo(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    public void calcoloArea() {
        super.calcoloArea();
        System.out.println(base*altezza);
    }
}
