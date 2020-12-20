
package applicants;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class MySQLDatabase {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    Scanner sc = null;

    void databaseOperation() {
        try {
            connect = Students.getInstance();
            sc = new Scanner(System.in);
           statement=connect.createStatement();
           result=statement.executeQuery("SELECT * FROM applicants");
            preparedStatement = connect.prepareStatement("SELECT * FROM applicants WHERE name=?");
            /*while (true) {
                System.out.println("Insert a name\n");
                preparedStatement.setString(1, sc.nextLine());
                result = preparedStatement.executeQuery();*/

                while (result.next()) {
                    System.out.println("Name:" + result.getString("name"));
                    System.out.println("Gender:" + result.getString("gender"));
                    System.out.println("Category:" + result.getString("category"));
                    System.out.println("SSC:" + result.getString("ssc"));
                    System.out.println("HSC:" + result.getString("hsc"));
                    System.out.println("Phone:" + result.getString("phone"));
                }
            }
       catch (Exception ex) {
            System.out.println("" + ex);
        }
        }
}
