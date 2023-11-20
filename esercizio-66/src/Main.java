import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
    try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anto_prova_1","developer","Ciaociao123!");

            Statement statement = connection.createStatement();

            String createTable = "CREATE TABLE students(" +
                    "student_id INT NOT NULL AUTO_INCREMENT," +
                    "last_name varchar(30)" +
                    "first_name varchar(30)" +
                    "PRIMARY KEY (student_id)" +
                    ")";

            statement.executeUpdate(createTable);

            String utente1 = "INSERT INTO students"+
                    "('last_name',"+
                    "'first_name')"+
                    "VALUSE "+
                    "('Troiano', "+
                    "'Antonio')";

            String utente2 = "INSERT INTO students"+
                    "('last_name',"+
                    "'first_name')"+
                    "VALUSE "+
                    "('Rossi', "+
                    "'Marco')";

            String utente3 = "INSERT INTO students"+
                    "('last_name',"+
                    "'first_name')"+
                    "VALUSE "+
                    "('Verdi', "+
                    "'Gennaro')";

            String utente4 = "INSERT INTO students"+
                    "('last_name',"+
                    "'first_name')"+
                    "VALUSE "+
                    "('Bianchi', "+
                    "'Paolo')";

            statement.executeUpdate(utente1);
            statement.executeUpdate(utente2);
            statement.executeUpdate(utente3);
            statement.executeUpdate(utente4);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}