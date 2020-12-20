
package applicants;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Applicants {

    
    public static void main(String[] args) {
       MySQLDatabase db = new MySQLDatabase();
        db.databaseOperation();  
    }
    
}
