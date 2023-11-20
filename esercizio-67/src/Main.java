import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anto_prova_1","developer","Ciaociao123!");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from students");

            while(resultSet.next()){
                System.out.println(resultSet.getString("last_name"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}