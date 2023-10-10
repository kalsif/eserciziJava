public class Rettangolo extends Forma {


    public Rettangolo(double base, double altezza) {
        super(base, altezza);
    }

    @Override
    public double calcoloArea() {
        return getBase()*getAltezza();
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "altezza=" + getAltezza() +
                '}';
    }
}
