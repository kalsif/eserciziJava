import java.util.ArrayList;

public class Classe {
    public String nome;
    public ArrayList<Studente> studenti;

    public Classe(String nome,ArrayList<Studente> studenti){
        this.nome=nome;
        this.studenti=studenti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "nome='" + nome + '\'' +
                ", studenti=" + studenti +
                '}';
    }
}

