public class Student {
    String nome;
    int id;

    public Student(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
