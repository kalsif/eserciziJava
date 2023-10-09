public class Triangolo extends Forma{
    public double base;
    public double altezza;

    public Triangolo(double base,double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcoloArea() {
        super.calcoloArea();
        System.out.println(base*altezza/2);
    }
}
