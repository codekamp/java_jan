package in.codekamp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) {
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
            s.execute("INSERT INTO `students` (`rollnumber`, `name`, `email`) VALUES (9919, 'Amit', 'amit@gmail.com')");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}