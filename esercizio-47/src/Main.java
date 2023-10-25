import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Antonio", 30);
        Student student2 = new Student("Mario", 29);
        Student student3 = new Student("Francesco", 27);

        List<Student> lista =new ArrayList<>();
        lista.add(student1);
        lista.add(student2);
        lista.add(student3);

        System.out.println(lista);

        Student student4 = new Student("Antonio", 31);
        Student student5 = new Student("Franco", 29);
        Student student6 = new Student("Luca", 27);
        Student student7 = new Student("Igor", 21);

        lista.add(student4);
        lista.add(student5);
        lista.add(student6);
        lista.add(student7);

        System.out.println(lista);
    }
}