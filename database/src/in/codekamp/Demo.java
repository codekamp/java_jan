package in.codekamp;


import javax.swing.*;
import java.sql.*;

public class Demo {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JListDemo d = new JListDemo();

        frame.add(d.panel);
        frame.pack();
        frame.setVisible(true);


        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Class found!!!");
        } catch (ClassNotFoundException e) {
            System.out.println("Sqlite JDBC not found");
            System.out.println("please download JDBC");
            return;
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:src/in/codekamp/hello.sqlite");
            Statement s = conn.createStatement();
//            s.execute("INSERT INTO `students` (`rollnumber`, `name`, `email`) VALUES (9919, 'Amit', 'amit@gmail.com')");

            ResultSet result = s.executeQuery("SELECT * FROM `students` WHERE `rollnumber` > 100");

            while (result.next()) {
                System.out.println(result.getString("name"));
                System.out.println(result.getInt("rollnumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}