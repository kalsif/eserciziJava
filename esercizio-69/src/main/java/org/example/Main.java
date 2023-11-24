package org.example;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/anto_prova_1";
    static final String USER = "developer";
    static final String PASSWORD = "Ciaociao123";

    public static void main(String[] args){

        try{
            Statement statement = createStatement();

            createViewItalian(statement);

            ResultSet rs = statement.executeQuery("SELECT * FROM italian_student");

            System.out.println(italian(rs));

            ResultSet res = statement.executeQuery("SELECT * FROM german_student");

            System.out.println(german(res));

        }catch (Exception e){
            e.getStackTrace();
        }
    }

    public static Statement createStatement() throws SQLException {

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public static void createViewItalian(Statement statement){
        try{
            String view1 = "CREATE VIEW italian_student AS "+
                    "SELECT s.first_name, s.last_name "+
                    "FROM students AS s "+
                    "WHERE country = 'Italian';";

            statement.executeUpdate(view1);


           String view2 = "CREATE VIEW german_student AS "+
                    "SELECT s.first_name, s.last_name "+
                    "FROM students AS s "+
                    "WHERE country = 'German';";

            statement.executeUpdate(view2);

        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

    public static ArrayList<Student> italian(ResultSet rs) throws SQLException {
        ArrayList<Student> italian_students = new ArrayList<>();

        while(rs.next()){
            Student student1 = new Student(
                    rs.getString("first_name"),
                    rs.getString("last_name"));
            italian_students.add(student1);
        }

        return italian_students;
    }

    public static ArrayList<Student> german(ResultSet res) throws SQLException {
        ArrayList<Student> german_students = new ArrayList<>();

        while(res.next()){
            Student student1 = new Student(
                    res.getString("first_name"),
                    res.getString("last_name"));
            german_students.add(student1);
        }

        return german_students;
    }
}