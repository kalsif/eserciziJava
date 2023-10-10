public class Triangolo extends Forma{

    public Triangolo(double base, double altezza) {
        super(base, altezza);
    }

    @Override
    public double calcoloArea() {
        return getBase()*getAltezza()/2;
    }
}
