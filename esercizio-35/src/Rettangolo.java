public class Rettangolo implements Forma{
    public double base;
    public double altezza;

    public Rettangolo(double base,double altezza){
        this.base= base;
        this.altezza=altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcoloArea() {
        return getBase()*getAltezza();
    }
}
