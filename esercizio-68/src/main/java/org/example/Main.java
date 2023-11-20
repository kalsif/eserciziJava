package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/anto_prova_1","developer","Ciaociao123!");

            Statement statement = connection.createStatement();


            String addColumn = "ALTER TABLE `students`\n" +
                    "\tADD COLUMN `country` VARCHAR(30)";
            statement.executeUpdate(addColumn);

            String user1country = " UPDATE `anto_prova_1`.`students`" +
                    " SET `country`='Italian' " +
                    "WHERE `students_id`=1";

            String user2country = " UPDATE `anto_prova_1`.`students`" +
                    " SET `country`='German' " +
                    "WHERE `students_id`=2";

            String user3country = " UPDATE `anto_prova_1`.`students`" +
                    " SET `country`='Italian' " +
                    "WHERE `students_id`=3";

            String user4country = " UPDATE `anto_prova_1`.`students`" +
                    " SET `country`='German' " +
                    "WHERE `students_id`=4";

            statement.executeUpdate(user1country);
            statement.executeUpdate(user2country);
            statement.executeUpdate(user3country);
            statement.executeUpdate(user4country);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}