// ho lasciato ancora gli attributi della classe public dato che ci chiede nel ultimo esercizio di usare private
public class Studente {
    public String nome;
    public String cognome;
    public int numIdentif;

    public Studente(String nome, String cognome, int numIdentif){
        this.nome = nome;
        this.setCognome(cognome);
        this.numIdentif = numIdentif;
    }

    public int getNumIdentif(){
        return numIdentif;
    }

    public void setNumIdentif(int numIdentif) {
        this.numIdentif = numIdentif;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Studente {" +
                "nome ='" + nome + '\'' +
                ", cognome ='" + cognome + '\'' +
                ", id =" + numIdentif +
                '}';
    }
}



