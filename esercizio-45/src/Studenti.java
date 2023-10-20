import java.util.ArrayList;

public class Studenti {
    String nome;

    public Studenti(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Studenti{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
