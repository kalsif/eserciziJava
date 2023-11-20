import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> surname = new ArrayList<>();

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anto_prova_1","developer","Ciaociao123!");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from students");

            while(resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
                surname.add(resultSet.getString("last_name"));
            }

            System.out.println(surname);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}