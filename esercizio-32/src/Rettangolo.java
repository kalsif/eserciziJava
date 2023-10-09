public class Rettangolo extends Forma{
    public double base;
    public double altezza;

    public Rettangolo(double base,double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcoloArea() {
        super.calcoloArea();
        System.out.println(base*altezza);
    }
}
