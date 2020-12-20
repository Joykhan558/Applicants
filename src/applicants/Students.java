
package applicants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Students {
    private static Connection connection=null;
       static Connection getInstance()throws SQLException, ClassNotFoundException{
          if(connection==null){
              Class.forName("com.mysql.jdbc.Driver");
          connection = DriverManager.getConnection("jdbc:mysql://localhost/admission?" +"user=root");
          }
           return connection;
       }
}
