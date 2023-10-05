import java.util.Arrays;

public class Classi {
    private Studente[] classeA;
    private Studente[] classeB;


    public Classi(Studente[] classeA,Studente[] classeB){
        this.classeA = classeA;
        this.classeB = classeB;
    }


    public Studente[] getClasseA() {
        return classeA;
    }

    public Studente[] getClasseB() {
        return classeB;
    }

    public void setClasseA(Studente [] classeA){
        this.classeA = classeA;
    }

    @Override
    public String toString() {
        return "Classi {" +
                "classe A =" + Arrays.toString(classeA) +
                ", classe B =" + Arrays.toString(classeB) +
                '}';
    }
}

