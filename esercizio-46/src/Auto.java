import java.util.ArrayList;

public class Auto {
    ArrayList<String> modelli;

    public Auto(ArrayList<String> modelli) {
        this.modelli = modelli;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelli=" + modelli +
                '}';
    }
}
