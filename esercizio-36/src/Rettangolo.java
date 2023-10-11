public class Rettangolo implements Forma{
    public double base;
    public double altezza;
    Famiglia famiglia;

    public Rettangolo(double base, double altezza, Famiglia famiglia){
        this.base=base;
        this.altezza=altezza;
        this.famiglia=famiglia;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcoloArea() {
        return getBase()*getAltezza();
    }
}
